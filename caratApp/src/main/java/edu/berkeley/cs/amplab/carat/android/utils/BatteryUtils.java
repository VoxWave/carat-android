package edu.berkeley.cs.amplab.carat.android.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;

/**
 * Created by Jonatan Hamberg on 1/25/17.
 */
public class BatteryUtils {
    private static final String TAG = BatteryUtils.class.getSimpleName();
    private static final int DEFAULT_SCALE = 100;
    private static final int DEFAULT_LEVEL = 0;

    public static double getBatteryLevel(Context context){
        Intent intent =
                context.registerReceiver(null, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        return getBatteryLevel(intent);
    }

    public static double getBatteryLevel(Intent intent){
        if(intent == null){
            return -1;
        }

        double level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
        double scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1);

        // TODO: Remove logging while confirmed working. This floods the log.
        if(level < 0){
            Logger.d(TAG,
                    "Missing battery level information or negative for " + intent.getAction());
            level = DEFAULT_LEVEL;
        }
        if(scale <= 0){
            Logger.d(TAG,
                    "Missing battery scale information or invalid value for " + intent.getAction());
            scale = DEFAULT_SCALE;
        }

        if(level > 0 && scale > 0){
            level = level / scale * 100.0;
        }
        return Math.round(level);
    }

    public static boolean isFull(Intent intent){
        int status = intent.getIntExtra(BatteryManager.EXTRA_STATUS, -1);
        if(status == -1){
            Logger.d(TAG, "Missing battery status");
        }
        double level = BatteryUtils.getBatteryLevel(intent);
        return status == BatteryManager.BATTERY_STATUS_FULL || level >= 100;
    }

    public static Boolean3 isCharging(Intent intent){
        int plugged = intent.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);
        int status = intent.getIntExtra(BatteryManager.EXTRA_STATUS, -1);

        // This is quite common which is why we use three-valued logic
        if(plugged == -1 && status == -1){
            return Boolean3.MAYBE;
        }

        // Accept any indication that we are charging
        boolean isPlugged =
                    plugged == BatteryManager.BATTERY_PLUGGED_AC
                ||  plugged == BatteryManager.BATTERY_PLUGGED_USB
                ||  status  == BatteryManager.BATTERY_STATUS_CHARGING;

        return isPlugged ? Boolean3.YES : Boolean3.NO;
    }
}
