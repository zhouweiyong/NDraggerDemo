package com.nz.vmdemo;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.nz.vmdemo.bean.User;

public class Demo1ViewModel extends ViewModel {
    private MutableLiveData<User> user;

    public LiveData<User> getUser() {
        if (user == null) {
            user = new MutableLiveData<>();
            user.postValue(new User("tom", 26));
        }
        return user;
    }

    public void refreshUser() {
        user.postValue(new User("jack", 17));
    }
}
