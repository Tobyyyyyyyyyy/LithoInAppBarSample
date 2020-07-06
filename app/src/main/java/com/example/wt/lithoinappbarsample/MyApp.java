package com.example.wt.lithoinappbarsample;

import android.app.Application;

import com.facebook.soloader.SoLoader;

/**
 * MyApp
 *
 * @author wt
 * @create 2020-06-22 16:27
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SoLoader.init(this, false);
    }

}
