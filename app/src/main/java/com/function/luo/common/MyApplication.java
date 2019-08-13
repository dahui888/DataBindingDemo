package com.function.luo.common;

import android.app.Application;

import com.function.luo.di.AppComponent;
import com.function.luo.di.AppModule;
import com.function.luo.di.DaggerAppComponent;


/**
 * Created by fcn-mq on 2017/5/31.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        inject();
    }

    private void inject() {
        AppComponent component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        ComponentHolder.setComponent(component);
    }
}
