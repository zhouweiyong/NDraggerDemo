package com.nz.vmdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.nz.vmdemo.demo1.Demo1Activity;
import com.nz.vmdemo.demo2.Demo2Activity;
import com.nz.vmdemo.demo3.Demo3Activity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
                startActivity(new Intent(this, Demo1Activity.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(this, Demo2Activity.class));
                break;
            case R.id.btn3:
                startActivity(new Intent(this, Demo3Activity.class));
                break;
        }
    }
}
