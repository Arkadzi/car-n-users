package com.example.arkadius.carsnusers.app;

import com.example.arkadius.carsnusers.data.di.UserComponent;
import com.example.arkadius.carsnusers.data.di.UserModule;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    UserComponent plus(UserModule userModule);

}
