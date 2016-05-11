package com.roberterrera.retrofit2_dagger2_practice.modules;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Rob on 5/11/16.
 */
@Module
public class AppModule {

    Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }

    @Provides @Singleton
    Application providesApplication() {
        return mApplication;
    }
}
