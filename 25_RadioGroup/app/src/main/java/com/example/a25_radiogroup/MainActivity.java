package com.example.a25_radiogroup;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    RadioButton year1,year2,year3,year4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        year1 = (RadioButton)findViewById(R.id.rdbYear1);
        year2 = (RadioButton)findViewById(R.id.rdbYear2);
        year3 = (RadioButton)findViewById(R.id.rdbYear3);
        year4 = (RadioButton)findViewById(R.id.rdbYear4);
        Button btn = (Button)findViewById(R.id.getBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "Selected Age: ";
                result+= (year1.isChecked())?"Red":(year2.isChecked())?"Yellow":(year3.isChecked())?"Green":(year4.isChecked())?"Blue":"";
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        String str="";
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rdbYear1:
                if(checked)
                    str = "Red Selected";
                break;
            case R.id.rdbYear2:
                if(checked)
                    str = "Yellow Selected";
                break;
            case R.id.rdbYear3:
                if(checked)
                    str = "Green Selected";
                break;
            case R.id.rdbYear4:
                if(checked)
                    str = "Blue Selected";
                break;
        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }
}

