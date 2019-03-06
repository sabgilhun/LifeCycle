package com.example.sabgil.activitylifecycle.main;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

public class MainViewModel extends ViewModel {

    final String TAG = this.getClass().getSimpleName();
    @Override
    protected void onCleared() {
        super.onCleared();

        Log.i(TAG, "라이프사이클 : onCleared");
    }
}
