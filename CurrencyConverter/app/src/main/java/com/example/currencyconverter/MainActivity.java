package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertMe(View view){
        EditText dollarAmount = (EditText) findViewById(R.id.dollar);
        Double dollarAmountDouble= Double.parseDouble(dollarAmount.getText().toString());

        Double IndianAmount = dollarAmountDouble * 79.93;
       // Toast.makeText(this, "₹"+IndianAmount.toString(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "₹"+ String.format("%.2f",IndianAmount) , Toast.LENGTH_SHORT).show();
       // Log.i("Amount",dollarAmount.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}