package ado.sabgil.fragmentlifecycle;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class LifeCycleTestFragment extends Fragment {
    final String TAG = getClass().getSimpleName();
    private int cnt = 0;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG, "라이프사이클 : onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "라이프사이클 : onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(TAG, "라이프사이클 : onCreateView");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView tv = getView().findViewById(R.id.tv);
        tv.setText(cnt + "");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "라이프사이클 : onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        cnt++;
        Log.i(TAG, "라이프사이클 : onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "라이프사이클 : onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "라이프사이클 : onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "라이프사이클 : onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "라이프사이클 : onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "라이프사이클 : onDetach");
    }
}
