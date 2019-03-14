package com.example.sabgil.activitylifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class LifeCycleTestActivity extends AppCompatActivity {
    final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(TAG, "라이프사이클 : onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG, "라이프사이클 : onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG, "라이프사이클 : onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG, "라이프사이클 : onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(TAG, "라이프사이클 : onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(TAG, "라이프사이클 : onDestroy");
    }
}
