package com.nz.vmdemo.demo3;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.widget.Toast;

import com.nz.vmdemo.BaseActivity;
import com.nz.vmdemo.bean.User;

public class Demo3ViewModel extends ViewModel {
    private BaseActivity activity;
    private String tag;
    private MutableLiveData<User> user;

    public Demo3ViewModel(BaseActivity activity, String tag) {
        this.activity = activity;
        this.tag = tag;
    }


    public LiveData<User> getUser() {
        if (user == null) {
            user = new MutableLiveData<>();
            user.postValue(new User(tag + "tom", 26));
        }
        return user;
    }

    public void changAge() {
        User u = user.getValue();
        u.setAge(u.getAge() + 1);
        user.postValue(u);
        Toast.makeText(activity, "age>>" + u.getAge(), Toast.LENGTH_SHORT).show();
    }
}
