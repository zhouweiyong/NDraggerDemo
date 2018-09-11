package com.nz.vmdemo.demo3;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.nz.vmdemo.BaseActivity;
import com.nz.vmdemo.R;
import com.nz.vmdemo.bean.User;

public class Demo3Activity extends BaseActivity implements View.OnClickListener {

    private TextView text_demo3;
    private Button btn_demo3;
    private Demo3ViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo3);
        initView();
    }

    private void initView() {
        text_demo3 = (TextView) findViewById(R.id.text_demo3);
        btn_demo3 = (Button) findViewById(R.id.btn_demo3);

        btn_demo3.setOnClickListener(this);
        Demo3ViewModelFactory factory = new Demo3ViewModelFactory(this, "demo3333");
        ViewModelProvider provider = new ViewModelProvider(this, factory);
        viewModel = provider.get(Demo3ViewModel.class);

        viewModel.getUser().observe(this, new Observer<User>() {
            @Override
            public void onChanged(@Nullable User user) {
                text_demo3.setText("name:" + user.getName() + " age:" + user.getAge());
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_demo3:
                viewModel.changAge();
                break;
        }
    }
}
