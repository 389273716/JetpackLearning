package com.tc.jetpacklearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //添加一个生命周期观察者    getLifecycle()是FragmentActivity中的方法
        MyObserver observer = new MyObserver();
        getLifecycle().addObserver(observer);
    }
}
