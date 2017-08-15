package com.example.arkadius.carsnusers.data.di;

import com.example.arkadius.carsnusers.data.di.scope.UserScope;

import dagger.Subcomponent;

@UserScope
@Subcomponent(
        modules = {
                UserModule.class
        }
)
public interface UserComponent {

}
