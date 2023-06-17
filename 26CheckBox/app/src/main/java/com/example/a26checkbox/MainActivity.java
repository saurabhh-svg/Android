package com.example.a26checkbox;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a26checkbox.R;

public class MainActivity extends AppCompatActivity {
    CheckBox bh, ch, jh;
    Button buttonOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick() {
        //Getting instance of CheckBoxes and Button from the activty_main.xml file
        bh = (CheckBox) findViewById(R.id.checkBox);
        ch = (CheckBox) findViewById(R.id.checkBox2);
        jh = (CheckBox) findViewById(R.id.checkBox3);
        buttonOrder = (Button) findViewById(R.id.button);
        //Applying the Listener on the Button click
        buttonOrder.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                if (bh.isChecked()) result.append("BHUTAGNI ");
                if (ch.isChecked()) result.append("CHITAGNI ");
                if (jh.isChecked()) result.append("JHATARAGNI ");
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }

        });
    }
}