package com.zaowu.mvvmlib;



import android.os.Bundle;

import com.zaowu.mvvmlib.databinding.ActivityMainBinding;
import com.zaowu.mvvmlib.mvvmhabit.base.BaseActivity;
import com.zaowu.mvvmlib.mvvmhabit.base.BaseViewModel;

public class MainActivity extends BaseActivity<ActivityMainBinding, BaseViewModel> {


    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }
}
