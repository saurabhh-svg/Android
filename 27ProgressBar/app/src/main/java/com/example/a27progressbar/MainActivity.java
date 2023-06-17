package com.example.a27progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
private int CurrentProgress=0;
private ProgressBar progressBar;
private Button startProgress;
//private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar =  findViewById(R.id.progress1);
        startProgress =  findViewById(R.id.button1);
       // textView = findViewById(R.id.text1);

        startProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentProgress+=10;
                progressBar.setProgress(CurrentProgress);
                progressBar.setMax(100);


               // textView.setText(CurrentProgress);
               // Toast.makeText(getApplicationContext(),CurrentProgress,Toast.LENGTH_LONG).show();
            }
        });


    }
}

