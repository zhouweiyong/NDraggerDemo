package com.nz.ndraggerdemo.dagger;

import com.nz.ndraggerdemo.ContainActivity;
import com.nz.ndraggerdemo.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BuildersMoule {
    @ActivityScope
    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity bindMainModule();

    @ActivityScope
    @ContributesAndroidInjector(modules = ContainModule.class)
    abstract ContainActivity bindContainModule();
}
