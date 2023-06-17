package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void fade(View view){

        ImageView bart = (ImageView) findViewById(R.id.bart);

        bart.animate().translationYBy(2000f).rotationBy(3600f).setDuration(2000);

      //  bart.animate().alpha(0f).setDuration(2000);
      //  ImageView homer= (ImageView) findViewById(R.id.homer);
        //homer.animate().alpha(1f).setDuration(2000);
    }
    public void fadehomer(View view){

        ImageView bart = (ImageView) findViewById(R.id.bart);
        ImageView homer= (ImageView) findViewById(R.id.homer);
        homer.animate().alpha(0f).setDuration(2000);
        bart.animate().alpha(1f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}