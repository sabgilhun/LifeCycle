package com.example.sabgil.activitylifecycle.main;

import android.app.AlertDialog;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.example.sabgil.activitylifecycle.LifeCycleTestActivity;
import com.example.sabgil.activitylifecycle.MyDialogActivity;
import com.example.sabgil.activitylifecycle.MyFragment;
import com.example.sabgil.activitylifecycle.R;
import com.example.sabgil.activitylifecycle.sub.SubActivity;

public class MainActivity extends LifeCycleTestActivity {

    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
    }


    public void onClickOpenAlertDialog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        AlertDialog dialog = builder.create();

        dialog.setMessage("AlertDialog");
        dialog.setTitle("AlertDialog");
        dialog.show();
    }

    public void onClickOpenDialogActivity(View view) {
        Intent intent = new Intent(this, MyDialogActivity.class);
        startActivity(intent);
    }

    public void onClickOpenActivity(View view) {
        Intent intent = new Intent(this, SubActivity.class);
        startActivity(intent);
    }

    public void onClickOpenFragment(View view) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame_layout, new MyFragment());
        ft.addToBackStack(MyFragment.class.getName());
        ft.commit();
    }

}
