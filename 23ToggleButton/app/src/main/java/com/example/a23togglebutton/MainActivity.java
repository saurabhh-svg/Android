package com.example.a23togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
ToggleButton tb1,tb2;
TextView tv1,tv2;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb1=(ToggleButton) findViewById(R.id.button1);
        tb2=(ToggleButton) findViewById(R.id.button2);
        btn = (Button) findViewById(R.id.button3);
        tv1=(TextView) findViewById(R.id.msg1);
        tv2=(TextView) findViewById(R.id.msg2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tb1.isChecked()==true){
                  tv1.setText("Hotspot turned 'ON'   !");
                }else{
                    tv1.setText("Hotspot turned 'OFF'   !");
                }
                if(tb2.isChecked()==true){
                    tv2.setText("Mobile Data turned 'ON'   !");
                }else{
                    tv2.setText("Mobile Data turned 'OFF'   !");
                }
            }
        });
    }
}

