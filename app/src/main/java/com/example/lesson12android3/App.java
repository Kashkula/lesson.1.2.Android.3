package com.example.lesson12android3;

import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        PreferencesUtils.init(this);
    }
}
