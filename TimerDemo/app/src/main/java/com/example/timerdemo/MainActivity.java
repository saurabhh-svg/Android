package com.example.timerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler=new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                Log.i("Runnable has run !!!","after 2 seconds");
                handler.postDelayed(this,2000);
            }
        };
       handler.post(run);
    }
}