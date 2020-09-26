package com.example.lesson12android3;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferencesUtils {
    private static SharedPreferences sharedPreferences;
    private final static String APP_PREF_NAME = "kg.geektech";
    private final static String USER_NAME = "kg.geektech.lesson";

    public static void init(Context context) {
        sharedPreferences = context.getSharedPreferences(APP_PREF_NAME, Context.MODE_PRIVATE);
    }

    public static void saveYourName(String userName) {
        sharedPreferences.edit().putString(USER_NAME, userName).apply();
    }

    public static String getYourName() {
       return sharedPreferences.getString(USER_NAME, "user not found");
    }
}
