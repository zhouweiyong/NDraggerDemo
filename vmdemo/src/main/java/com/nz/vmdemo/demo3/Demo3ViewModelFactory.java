package com.nz.vmdemo.demo3;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.nz.vmdemo.BaseActivity;

public class Demo3ViewModelFactory implements ViewModelProvider.Factory {
    private BaseActivity activity;
    private String tag;

    public Demo3ViewModelFactory(BaseActivity activity, String tag) {
        this.activity = activity;
        this.tag = tag;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new Demo3ViewModel(activity, tag);
    }
}
