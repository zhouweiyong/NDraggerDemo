package com.nz.ndraggerdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasFragmentInjector;

public class ContainActivity extends AppCompatActivity implements HasFragmentInjector{

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentInjector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        initView();
    }

    private void initView() {
        getFragmentManager().beginTransaction().replace(R.id.layout, new OneFragment()).commit();

    }

    @Override
    public AndroidInjector<Fragment> fragmentInjector() {
        return fragmentInjector;
    }
}
