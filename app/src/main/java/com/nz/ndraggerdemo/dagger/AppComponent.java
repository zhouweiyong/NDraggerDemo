package com.nz.ndraggerdemo.dagger;

import android.app.Application;

import com.nz.ndraggerdemo.MApp;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        BuildersMoule.class
        , ToolsModule.class})
public interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(MApp app);

        AppComponent build();
    }

    void inject(MApp app);
}
