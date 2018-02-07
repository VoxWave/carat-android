package edu.berkeley.cs.amplab.carat.android.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/**
 * Created by Jonatan Hamberg on 24.1.2018.
 */
public class FsUtils {
    private static final String TAG = FsUtils.class.getSimpleName();
    private static long INVALID_VALUE = -1;

    public static class THERMAL {
        private static WeakReference<File[]> thermalFiles = null;

        public static ArrayList<Long> getThermalZones(){
            File[] files = getFiles();
            Map<Integer, Long> result = readValues(files, "/temp", Long.class);
            return new ArrayList<>(result.values());
        }

        public static ArrayList<String> getThermalZoneNames(){
            File[] files = getFiles();
            Map<Integer, String> result = readValues(files, "/type", String.class);
            return new ArrayList<>(result.values());
        }

        public static long getCount() {
            File[] files = getFiles();
            if(!Util.isNullOrEmpty(files)){
                return files.length;
            }
            return INVALID_VALUE;
        }

        private static File[] getFiles() {
            return Util.getWeakOrFallback(thermalFiles, () -> {
                File[] result = listFiles("/sys/devices/virtual/thermal/", "thermal_zone[0-9]+");
                if (!Util.isNullOrEmpty(result)) {
                    thermalFiles = new WeakReference<>(result);
                }
                return result;
            });
        }
    }

    public static class CPU {
        private static WeakReference<File[]> cpuFiles = null;

        public static long getCount(){
            File[] files = getFiles();
            if(!Util.isNullOrEmpty(files)){
                return files.length;
            }
            return INVALID_VALUE;
        }

        public static ArrayList<Long> getCurrentFrequencies(){
            String subPath = "/cpufreq/scaling_cur_freq";
            Map<Integer, Long> frequencies = readValues(getFiles(), subPath, Long.class);
            return new ArrayList<>(frequencies.values());
        }

        public static ArrayList<Long> getMinimumFrequencies(){
            String subPath = "/cpufreq/cpuinfo_min_freq";
            Map<Integer, Long> frequencies = readValues(getFiles(), subPath, Long.class);
            return new ArrayList<>(frequencies.values());
        }

        public static ArrayList<Long> getMaximumFrequencies(){
            String subPath = "/cpufreq/cpuinfo_max_freq";
            Map<Integer, Long> frequencies = readValues(getFiles(), subPath, Long.class);
            return new ArrayList<>(frequencies.values());
        }

        public static ArrayList<Long> getUtilization(){
            String subPath = "/cpufreq/cpu_utilization";
            Map<Integer, Long> utilization = readValues(getFiles(), subPath, Long.class);
            return new ArrayList<>(utilization.values());
        }

        private static File[] getFiles(){
            return Util.getWeakOrFallback(cpuFiles, () -> {
                File[] result = listFiles("/sys/devices/system/cpu/", "cpu[0-9]+");
                if(!Util.isNullOrEmpty(result)){
                    cpuFiles = new WeakReference<>(result);
                }
                return result;
            });
        }
    }

    @SuppressWarnings("unchecked") // The casts are actually checked
    private static <V> Map<Integer, V> readValues(File[] files, String subPath, Class<V> valueClass){
        TreeMap<Integer, V> values = new TreeMap<>();
        if(!Util.isNullOrEmpty(files)){
            for(File file : files){
                try {
                    Integer id = Util.getDigits(file.getName());
                    if(id != null){
                        String path = file.getPath() + subPath;
                        V value = null;
                        if(valueClass == Long.class){
                            value = (V) readLong(path);
                        } else if(valueClass == String.class){
                            value = (V) readString(path);
                        } else {
                            Logger.e(TAG, "Unsupported type: " + valueClass.getSimpleName());
                        }
                        values.put(id, value);
                    }
                } catch (Exception e){
                    Logger.d(TAG, "Failed reading " + file.getPath());
                }
            }
        }
        return values;
    }

    private static File[] listFiles(String path, String pattern){
        File directory = new File(path);
        if(directory.canRead()){
            return directory.listFiles(file -> Pattern.matches(pattern, file.getName()));
        }
        return null;
    }

    private static Long readLong(String path){
        String content = readString(path);
        if(!Util.isNullOrEmpty(content)){
            try {
                return Long.parseLong(content);
            } catch (NumberFormatException e){
                Logger.d(TAG,  "Unable to convert to long " + e);
            }
        }
        return INVALID_VALUE;
    }

    private static String readString(String path){
        byte[] buffer = new byte[4096];
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(path);
            int length = inputStream.read(buffer);
            inputStream.close();

            if(length > 0){
                length = find(buffer, length);
                return new String(buffer, 0, length);
            }
        } catch (IOException e) {
            Logger.d(TAG, "Unable to file " + path + ", " + e);
        } finally {
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException ignored){
                    // This is normal
                }
            }
        }
        return null;
    }

    private static int find(byte[] array, int length){
        for(int i=0; i < length; i++){
            if(array[i] == '\n'){
                return i;
            }
        }
        return length;
    }

}
