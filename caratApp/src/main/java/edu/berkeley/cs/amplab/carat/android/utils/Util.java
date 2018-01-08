package edu.berkeley.cs.amplab.carat.android.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PowerManager;
import android.net.Uri;
import android.util.Pair;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.Callable;

import edu.berkeley.cs.amplab.carat.thrift.PackageProcess;

/**
 * General utilities for handling different data types.
 * Created by Jonatan Hamberg on 1.2.2017.
 */
public class Util {
    private final static String TAG = Util.class.getSimpleName();
    public interface Fallback<T> {
        T call();
    }

    public static double[] toArray(List<Double> list){
        double[] result = new double[list.size()];
        for(int i=0; i<result.length; i++){
            result[i] = list.get(i);
        }
        return result;
    }

    public static <K, V> SortedMap<K, V> firstEntries(int limit, SortedMap<K, V> source){
        TreeMap<K, V> result = new TreeMap<>();
        for(Map.Entry<K, V> entry : source.entrySet()){
            if(result.size() >= limit){
                break;
            }
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    public static <K, V> SortedMap<K, V> skipEntries(long amount, SortedMap<K, V> source){
        if(Util.isNullOrEmpty(source)){
            return new TreeMap<>();
        }
        TreeMap<K, V> result = new TreeMap<>();
        long counter = 0;
        for(Map.Entry<K, V> entry : source.entrySet()){
            if(counter < amount){
                counter++;
                continue;
            }
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    public static<T> T getWeakOrFallback(WeakReference<T> weakReference, Fallback<T> fallback){
        if(weakReference != null && weakReference.get() != null){
            T value = weakReference.get();
            if(value != null){ // Might become null between instructions
                return value;
            }
        }
        return fallback.call();
    }

    public static int[][] readLines(RandomAccessFile reader, int maxRows, int maxColumns, String delim) throws IOException {
        int[][] result = new int[maxRows + 1][maxColumns + 1];
        for (int row = 0; row < maxRows; row++) {
            String line = reader.readLine();
            if (line == null) break; // EOF
            String[] tokens = line.split(delim);
            for (int column = 0; column < maxColumns; column++) {
                if (maxColumns < tokens.length && isInteger(tokens[column])) {
                    result[row][column] = Integer.parseInt(tokens[column]);
                } else result[row][column] = 0; // Default to zero
            }
        }
        reader.seek(0); // Rewind
        return result;
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public static boolean isInteger(String value){
        try {
            Integer.parseInt(value);
        } catch(Throwable th){
            return false;
        }
        return true;
    }

    public static long timeAfterTime(long milliseconds){
        return System.currentTimeMillis() + milliseconds;
    }

    public static boolean isNullOrEmpty(String string){
        return string == null || string.trim().isEmpty();
    }

    public static boolean isNullOrEmpty(Bundle bundle){
        return bundle == null || bundle.size() == 0;
    }

    public static <T extends Map> boolean isNullOrEmpty(T t){
        return t == null || t.size() == 0;
    }

    public static boolean isSystemApp(int flags){
        return (flags & ApplicationInfo.FLAG_SYSTEM) > 0
                || (flags & ApplicationInfo.FLAG_UPDATED_SYSTEM_APP) > 0;
    }

    public static synchronized void safeReleaseWakelock(PowerManager.WakeLock wl){
        try{
            if(wl.isHeld()){
                wl.release();
            }
        } catch(Throwable th){
            Logger.d(TAG, "Releasing wakelock failed: " + th);
        }
    }

    public static PackageProcess getDefaultPackageProcess(){
        int ERR_VAL = -1;
        return new PackageProcess()
                .setProcessName("Unknown")
                .setProcessCount(ERR_VAL)
                .setUId(ERR_VAL)
                .setSleeping(false)
                .setForeground(false)
                .setForegroundTime(ERR_VAL)
                .setLaunchCount(ERR_VAL)
                .setImportance(ERR_VAL)
                .setCrashCount(ERR_VAL)
                .setLastStartSinceBoot(ERR_VAL)
                .setLastStartTimestamp(ERR_VAL);
    }

    public static void openStorePage(Context context, String packageName){
        try {
            Intent marketIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + packageName));
            context.startActivity(marketIntent);
        } catch (android.content.ActivityNotFoundException anfe) {
            Intent playIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + packageName));
            context.startActivity(playIntent);
        }
    }
}
