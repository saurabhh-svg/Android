package com.example.a28_date_picker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button dateFormat;
    TextView textView;
    int year;
    int month;
    int day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dateFormat = (Button) findViewById(R.id.EditText1);
        textView = (TextView) findViewById((R.id.TextView1));
        Calendar calendar = Calendar.getInstance();
        dateFormat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             year=calendar.get(Calendar.YEAR);
             month = calendar.get(Calendar.MONDAY);
             day=calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog= new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                           textView.setText(SimpleDateFormat.getInstance().format(calendar.getTime()));
                    }
                },year,month,day);
                        datePickerDialog.show();

            }
        });
    }
}