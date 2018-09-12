package com.nz.ndraggerdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nz.ndraggerdemo.utils.ColorUtils;
import com.nz.ndraggerdemo.utils.OneUtils;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class OneFragment extends Fragment {

    private TextView text1_fo;
    private TextView text2_fo;
    private TextView text3_fo;
    @Inject
    ColorUtils colorUtils;
    @Inject
    OneUtils oneUtils;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);

        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_one, container, false);
        initView(inflate);
        return inflate;
    }

    private void initView(View inflate) {
        text1_fo = (TextView) inflate.findViewById(R.id.text1_fo);
        text2_fo = (TextView) inflate.findViewById(R.id.text2_fo);
        text3_fo = (TextView) inflate.findViewById(R.id.text3_fo);

        text1_fo.setText(colorUtils.getCurrentColor());
        text2_fo.setText(oneUtils.getName());
    }
}
