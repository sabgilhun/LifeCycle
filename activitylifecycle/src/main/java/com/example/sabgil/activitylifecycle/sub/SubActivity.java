package com.example.sabgil.activitylifecycle.sub;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.sabgil.activitylifecycle.LifeCycleTestActivity;
import com.example.sabgil.activitylifecycle.R;

public class SubActivity extends LifeCycleTestActivity {

    private SubViewModel subViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        subViewModel = ViewModelProviders.of(this).get(SubViewModel.class);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
