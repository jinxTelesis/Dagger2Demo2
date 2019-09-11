package com.example.dagger2demo2;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    Application mApplication; // this is weird

    public AppModule(Application application){
        mApplication = application;
    }


    @Provides
    @Singleton
    Application providesApplication(){
        return mApplication;
    }
}
