package edu.berkeley.cs.amplab.carat.android;

import android.app.AlarmManager;
import android.graphics.Color;

import java.util.concurrent.TimeUnit;

public class Constants {
    // Whether to output debug messages.
    public static final boolean DEBUG = true;

    // Report Freshness timeout. Default: 15 minutes
    // public static final long FRESHNESS_TIMEOUT = 30 * 1000;
    public static final long FRESHNESS_TIMEOUT = AlarmManager.INTERVAL_FIFTEEN_MINUTES;
    // Blacklist freshness timeout. Default 24h.
    // public static final long FRESHNESS_TIMEOUT_BLACKLIST = 30 * 1000;
    public static final long FRESHNESS_TIMEOUT_BLACKLIST = 24 * 3600 * 1000;
    // Blacklist freshness timeout. Default 2 days.
    // public static final long FRESHNESS_TIMEOUT_QUICKHOGS = 30 * 1000;
    public static final long FRESHNESS_TIMEOUT_QUICKHOGS = 2 * 24 * 3600 * 1000;
    // Hog statistics freshness timeout. Default 1 day.
    public static final long FRESHNESS_TIMEOUT_HOGSTATS = TimeUnit.DAYS.toMillis(1);
    // Questionnaire freshness timeout. Default 1 day.
    public static final long FRESHNESS_TIMEOUT_QUESTIONNAIRE = TimeUnit.DAYS.toMillis(1);

    // Dashboard refresh interval
    public static final long DASHBOARD_REFRESH_INTERVAL = TimeUnit.MINUTES.toMillis(1);

    // Thrift connection timeout
    public static final int THRIFT_CONNECTION_TIMEOUT = (int)TimeUnit.MINUTES.toMillis(1);

    // If this preference is true, register this as a new device on the Carat
    // server.
    public static final String PREFERENCE_FIRST_RUN = "carat.first.run";
    static final String REGISTERED_UUID = "carat.registered.uuid";
    public static final String REGISTERED_OS = "carat.registered.os";
    public static final String REGISTERED_MODEL = "carat.registered.model";

    // for caching summary statistics fetched from server
    public static final String PREFERENCE_FILE_NAME = "caratPrefs";
    public static final String STATS_WELLBEHAVED_COUNT_PREFERENCE_KEY = "wellbehavedPrefKey";
    public static final String STATS_HOGS_COUNT_PREFERENCE_KEY = "hogsPrefKey";
    public static final String STATS_BUGS_COUNT_PREFERENCE_KEY = "bugsPrefKey";

    public static final String STATS_APP_WELLBEHAVED_COUNT_PREFERENCE_KEY = "appWellbehavedPrefKey";
    public static final String STATS_APP_HOGS_COUNT_PREFERENCE_KEY = "appHogsPrefKey";
    public static final String STATS_APP_BUGS_COUNT_PREFERENCE_KEY = "appBugsPrefKey";

    public static final String STATS_IOS_WELLBEHAVED_COUNT_PREFERENCE_KEY = "iosWellbehavedPrefKey";
    public static final String STATS_IOS_HOGS_COUNT_PREFERENCE_KEY = "iosHogsPrefKey";
    public static final String STATS_IOS_BUGS_COUNT_PREFERENCE_KEY = "iosBugsPrefKey";

    public static final String STATS_USER_BUGS_COUNT_PREFERENCE_KEY = "userBugsPrefKey";
    public static final String STATS_USER_NO_BUGS_COUNT_PREFERENCE_KEY = "userNoBugsPrefKey";

    public static final String PREFERENCE_NEW_UUID = "carat.new.uuid";
    public static final String PREFERENCE_TIME_BASED_UUID = "carat.uuid.timebased";

    // Check for and send new samples at most every 15 minutes, but only when
    // the user wakes up/starts Carat
    public static final long COMMS_INTERVAL = AlarmManager.INTERVAL_FIFTEEN_MINUTES;
    // When waking up from screen off, wait 5 seconds for wifi etc to come up
    public static final long COMMS_WIFI_WAIT = 5 * 1000;
    // Send up to 10 samples at a time
    public static final int COMMS_MAX_UPLOAD_BATCH = 10;

    // Alarm event for sampling when battery has not changed for
    // SAMPLE_INTERVAL_MS. Currently not used.
    public static final String ACTION_CARAT_SAMPLE = "edu.berkeley.cs.amplab.carat.android.ACTION_SAMPLE";
    // If true, install Sampling events to occur at boot. Currently not used.
    public static final String PREFERENCE_SAMPLE_FIRST_RUN = "carat.sample.first.run";
    public static final String PREFERENCE_SEND_INSTALLED_PACKAGES = "carat.sample.send.installed";

    // default icon and Carat package name:
    public static final String CARAT_PACKAGE_NAME = "edu.berkeley.cs.amplab.carat.android";
    // Used to blacklist old Carat
    public static final String CARAT_OLD = "edu.berkeley.cs.amplab.carat";

    // Not in Android 2.2, but needed for app importances
    public static final int IMPORTANCE_PERCEPTIBLE = 130;
    // Used for non-app suggestions
    public static final int IMPORTANCE_SUGGESTION = 123456789;

    public static final String IMPORTANCE_NOT_RUNNING = "Not Running";
    public static final String IMPORTANCE_UNINSTALLED = "uninstalled";
    public static final String IMPORTANCE_DISABLED = "disabled";
    public static final String IMPORTANCE_INSTALLED = "installed";
    public static final String IMPORTANCE_REPLACED = "replaced";

    public static final int COMMS_MAX_BATCHES = 50;

    // Used for bugs and hogs, and EnergyDetails sub-screen (previously known as drawing)
    public enum Type {
        OS, MODEL, HOG, BUG, SIMILAR, JSCORE, OTHER, BRIGHTNESS, WIFI, MOBILEDATA
    }

    // used in the PrefetchData class and MainActivity
    // (to check whether the users statistics are fetched from the server)
    public static final String DATA_NOT_AVAIABLE = "not_available";

    public static final String MAIN_ACTIVITY_PREFERENCE_KEY = "Main_Activity_Shared_Preferences_Key";

    // keys for retrieving values from the shared preference
    public static final String WELL_BEHAVED_APPS_COUNT_PREF_KEY = "wellbehaved";
    public static final String HOGS_COUNT_PREF_KEY = "hogs";
    public static final String BUGS_COUNT_PREF_KEY = "bugs";

    // Used for messages in comms threads
    static final String MSG_TRY_AGAIN = " will try again in " + (FRESHNESS_TIMEOUT / 1000) + "s.";

    public static int VALUE_NOT_AVAILABLE = -1;

    public static final int[] CARAT_COLORS = {
            Color.rgb(90, 198, 108), /* green 3 - Normal green*/
            Color.rgb(240, 71, 31) /*Beautiful Orange*/,
            Color.rgb(250, 150, 38) /*Yellow*/,
            Color.rgb(193, 216, 216) /*Gray*/,
            Color.rgb(207, 218, 227) /*Mild Gray*/
        /* Color.rgb(220, 84, 26), //Orange
    	Color.rgb(54, 185, 52),
    	Color.rgb(43, 188, 66),  // green 2
    	Color.rgb(90, 198, 108),  // green 3 - Normal green
    	Color.rgb(138, 221, 96),  // green 4
    	Color.rgb(113, 204, 85),  // green 5
    	Color.rgb(130, 201, 142),  // mate green 
		Color.rgb(55, 145, 120), //dark green */
    };

    public static final int REQUESTCODE_ACCEPT_EULA = 16401;

    // FRAGMENT TAGS
    public static final String FRAGMENT_DASHBOARD_TAG = "fragment_dashboard";
    public static final String FRAGMENT_BUGS_TAG = "fragment_bugs";
    public static final String FRAGMENT_HOGS_TAG = "fragment_hogs";
    public static final String FRAGMENT_GLOBAL_TAG = "fragment_global";
    public static final String FRAGMENT_ACTIONS_TAG = "fragment_actions";
    public static final String FRAGMENT_MY_DEVICE_TAG = "fragment_my_device";
    public static final String FRAGMENT_ABOUT_TAG = "fragment_about";
    public static final String FRAGMENT_SETTINGS_TAG = "fragment_settings";
    public static final String FRAGMENT_CB_WEBVIEW_TAG = "fragment_callback_webview";
    public static final String FRAGMENG_HOG_STATS_TAG = "fragment_hog_stats";
    public static final String FRAGMENT_PROCESS_LIST = "fragment_process_list";
    public static final String FRAGMENT_HIDE_SMALL = "fragment_hide_small";

    public static final String FRAGMENT_QUESTIONNAIRE_CHOICE = "questionnaire_choice";
    public static final String FRAGMENT_QUESTIONNAIRE_MULTICHOICE = "questionnaire_multichoice";
    public static final String FRAGMENT_QUESTIONNAIRE_INFORMATION = "questionnaire_information";
    public static final String FRAGMENT_QUESTIONNAIRE_INPUT = "questionnaire_input";
}
