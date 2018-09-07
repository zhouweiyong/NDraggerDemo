package com.nz.ndraggerdemo.dagger;

import android.content.Context;

import com.nz.ndraggerdemo.MApp;
import com.nz.ndraggerdemo.utils.ColorUtils;

import dagger.Module;
import dagger.Provides;

@Module
public class ToolsModule {
    @Provides
    Context provideContext(MApp app) {
        return app.getApplicationContext();
    }

    @Provides
    ColorUtils provideColorUtils() {
        return new ColorUtils();
    }
}
