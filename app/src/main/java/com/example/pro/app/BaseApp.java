package com.example.pro.app;

import android.app.Application;

import com.purewhite.ywc.purewhitelibrary.app.AppUtils;

public class BaseApp extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        //纯白框架
        initPure();

    }



    private void initPure() {

        AppUtils.initLibrary(this,"",375);
    }
}
