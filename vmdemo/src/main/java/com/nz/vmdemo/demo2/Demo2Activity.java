package com.nz.vmdemo.demo2;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.nz.vmdemo.R;

public class Demo2Activity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_f1;
    private Button btn_f2;
    private FrameLayout flyt;
    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo2);
        initView();

    }

    private void initView() {
        btn_f1 = (Button) findViewById(R.id.btn_f1);
        btn_f2 = (Button) findViewById(R.id.btn_f2);
        flyt = (FrameLayout) findViewById(R.id.flyt);

        btn_f1.setOnClickListener(this);
        btn_f2.setOnClickListener(this);
        fragmentManager = getSupportFragmentManager();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_f1:
                fragmentManager.beginTransaction().replace(R.id.flyt, new C1Fragment()).addToBackStack("1").commit();
                break;
            case R.id.btn_f2:
                fragmentManager.beginTransaction().replace(R.id.flyt, new C2Fragment()).addToBackStack("2").commit();
                break;
        }
    }
}
