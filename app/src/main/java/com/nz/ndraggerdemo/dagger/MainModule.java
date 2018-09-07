package com.nz.ndraggerdemo.dagger;

import com.nz.ndraggerdemo.utils.MainUtils;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {
    @Provides
    MainUtils provideMainUtils(){
        return new MainUtils();
    }
}
