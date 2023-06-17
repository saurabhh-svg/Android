package com.example.a28spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    String names[]={"Saurabh","Samar","Virat","Rohit","Rahul","Aanchal","Other"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, R.layout.item_file ,names);
        adapter.setDropDownViewResource(R.layout.item_file);
spinner.setAdapter(adapter);
spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
        String value=parent.getItemAtPosition(i).toString();
        Toast.makeText(MainActivity.this,value,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
});
    }
}