package com.example.kotlinproj.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

import com.example.kotlinproj.BaseApplication;
import com.example.kotlinproj.R;

public class CacheUtils {
    @SuppressLint("StaticFieldLeak")
    private static Context context = BaseApplication.currentApplication();

    private static SharedPreferences SP = context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE);

    public static void save(String key, String value) {
        SP.edit().putString(key, value).apply();
    }

    public static String get(String key) {
        return SP.getString(key, null);
    }
}
