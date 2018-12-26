package com.evolvear.sdksamplelog;

import android.util.Log;

public class LogDebug {
    private static final String TAG ="SUPER_LOG_MESSAGE";

    public static void d(String message){
        Log.d(TAG,message);
    }
}
