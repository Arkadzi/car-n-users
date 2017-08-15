package com.example.arkadius.carsnusers.app;

import android.content.Context;

import com.example.arkadius.carsnusers.data.di.UserComponent;
import com.example.arkadius.carsnusers.data.di.UserModule;

/**
 * Created by arkadius on 8/15/17.
 */

public class Application extends android.app.Application {
    private ApplicationComponent component;
    private UserComponent userComponent;

    public static Application getApp(Context context) {
        return (Application) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        buildAppComponent();
        buildUserComponent();
    }


    private void buildAppComponent() {
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    private void buildUserComponent() {
        userComponent = component.plus(new UserModule());
    }

    public ApplicationComponent getAppComponent() {
        return component;
    }

    public UserComponent getUserComponent() {
        return userComponent;
    }
}
