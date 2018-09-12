package com.nz.ndraggerdemo.dagger;

import com.nz.ndraggerdemo.utils.OneUtils;

import dagger.Module;
import dagger.Provides;

@Module
public class OneFragmentModule {
    @Provides
    public OneUtils provideOneUtils() {
        return new OneUtils();
    }
}
