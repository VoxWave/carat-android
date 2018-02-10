package edu.berkeley.cs.amplab.carat.android.receivers;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.util.Log;

import edu.berkeley.cs.amplab.carat.android.Keys;
import edu.berkeley.cs.amplab.carat.android.sampling.SamplingLibrary;
import edu.berkeley.cs.amplab.carat.android.utils.Logger;
import edu.berkeley.cs.amplab.carat.android.utils.PrefsManager;

public class InstallReceiver extends BroadcastReceiver {

    private static final String TAG = "InstallReceiver";

    /**
     * Used to record package installs and uninstalls. Their details will be
     * sent in the next Sample.
     * 
     * @param context
     *            the context
     * @param intent
     *            the intent (ACTION_PACKAGE_ADDED, _REPLACED, or _REMOVED)
     */
    @SuppressLint("CommitPrefEdits")
    @Override
    public void onReceive(Context context, Intent intent) {
        String a = intent.getAction();
        SharedPreferences p = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        String data = intent.getDataString();
        if (a == null && data == null)
            return;
        Logger.d(TAG, "Package " + data);
        String pkg = data.substring(8);
        Editor e = p.edit().remove(SamplingLibrary.SIG_SENT_256 + pkg).remove(SamplingLibrary.SIG_SENT + pkg);

        // Schedule sending of sig of installed and replaced pkgs.
        if (a != null && a.equals(Intent.ACTION_PACKAGE_ADDED)) {
            boolean replacing = intent.getBooleanExtra(Intent.EXTRA_REPLACING, false);
            if (!replacing) {
                Logger.i(TAG, "INSTALLED: " + pkg);
                e.putBoolean(SamplingLibrary.INSTALLED + pkg, true).commit();
                e.putBoolean(Keys.installationChanges, true).commit();
            }
        } else if (a != null && a.equals(Intent.ACTION_PACKAGE_REMOVED)) {
            boolean replacing = intent.getBooleanExtra(Intent.EXTRA_REPLACING, false);
            /*
             * send the uninstallation flag in the next sample.
             */
            if (!replacing) {
                Logger.i(TAG, "UNINSTALLED: " + pkg);
                e.putBoolean(SamplingLibrary.UNINSTALLED + pkg, true).commit();
                e.putBoolean(Keys.installationChanges, true).commit();
            }
        } else if (a!= null && a.equals(Intent.ACTION_PACKAGE_REPLACED)) {
            Logger.i(TAG, "REPLACED: " + pkg);
            e.putBoolean(SamplingLibrary.REPLACED + pkg, true).commit();
            e.putBoolean(Keys.installationChanges, true).commit();
        }
    }
}
