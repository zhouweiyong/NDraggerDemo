package com.nz.vmdemo.demo1;

import android.arch.lifecycle.Observer;

import android.arch.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.nz.vmdemo.R;
import com.nz.vmdemo.bean.User;

public class Demo1Activity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_user;
    private Button btn_refresh;
    private Demo1ViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo1);
        ViewModelProvider.AndroidViewModelFactory factory = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication());
        ViewModelProvider viewModelProvider = new ViewModelProvider(this, factory);
        viewModel = viewModelProvider.get(Demo1ViewModel.class);
        initView();
    }

    private void initView() {
        tv_user = (TextView) findViewById(R.id.tv_user);
        btn_refresh = (Button) findViewById(R.id.btn_refresh);

        btn_refresh.setOnClickListener(this);

        viewModel.getUser().observe(this, new Observer<User>() {
            @Override
            public void onChanged(@Nullable User user) {
                tv_user.setText("name:" + user.getName() + " age:" + user.getAge());
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_refresh:
                viewModel.refreshUser();
                break;
        }
    }
}
