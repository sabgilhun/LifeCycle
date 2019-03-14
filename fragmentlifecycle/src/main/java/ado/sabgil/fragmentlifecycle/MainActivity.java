package ado.sabgil.fragmentlifecycle;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private FrameLayout mContainer;
    private FragmentManager fragmentManager;
    private AFragment aFragment;
    private BFragment bFragment;
    private CFragment cFragment;
    private int pos;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragmentManager.beginTransaction()
                            .replace(R.id.fl_container, new AFragment())
                            .commit();
                    return true;
                case R.id.navigation_dashboard:
                    fragmentManager.beginTransaction()
                            .replace(R.id.fl_container, new BFragment())
                            .commit();
                    return true;
                case R.id.navigation_notifications:
                    fragmentManager.beginTransaction()
                            .replace(R.id.fl_container, new CFragment())
                            .commit();

                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = findViewById(R.id.message);
        mContainer = findViewById(R.id.fl_container);
        fragmentManager = getSupportFragmentManager();
        cFragment = new CFragment();
        bFragment = new BFragment();
        aFragment = new AFragment();
        pos = 0;
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
