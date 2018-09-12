package com.nz.ndraggerdemo.dagger;

import com.nz.ndraggerdemo.OneFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface ContainModule {
    @FragmentScope
    @ContributesAndroidInjector(modules = OneFragmentModule.class)
    OneFragment oneFragment();
}
