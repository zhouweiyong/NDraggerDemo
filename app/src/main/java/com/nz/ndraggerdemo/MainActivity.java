package com.nz.ndraggerdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.nz.ndraggerdemo.utils.ColorUtils;
import com.nz.ndraggerdemo.utils.MainUtils;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1;
    @Inject
    ColorUtils colorUtils;
    private Button btn2;
    @Inject
    MainUtils mainUtils;
    @Inject
    Context context;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Log.i("zwy", colorUtils.getCurrentColor());
                break;
            case R.id.btn2:
                Log.i("zwy", mainUtils.getName());
                Toast.makeText(context, mainUtils.getName(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn3:
                startActivity(new Intent(this, ContainActivity.class));
                break;
        }
    }
}
