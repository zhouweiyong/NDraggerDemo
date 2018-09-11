package com.nz.vmdemo.demo2;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.nz.vmdemo.bean.User;

public class Demo2ViewModel extends ViewModel {

    private MutableLiveData<User> user;

    public LiveData<User> getUser() {
        if (user == null) {
            user = new MutableLiveData<>();
            user.postValue(new User("tom", 26));
        }
        return user;
    }

    public void changAge() {
        User u = user.getValue();
        u.setAge(u.getAge() + 1);
        user.postValue(u);
    }
}
