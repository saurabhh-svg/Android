package com.example.highorlow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number{
        int number;
        public boolean  isSquare(){
            double squareRoot = Math.sqrt(number);
            if(squareRoot==Math.floor(squareRoot)){
                return true;
            }
            else{
                return false;
            }
        }

        public boolean isTriangular(){
            int x=1;
            int triangularNumber=1;
            while (triangularNumber<number) {
                x++;
                triangularNumber=triangularNumber+x;
            }
            if(triangularNumber==number){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public void testNumber(View view) {

        EditText userNumber = (EditText) findViewById(R.id.userNumber);

        String message = "";

        if (userNumber.getText().toString().isEmpty()) {
            message = "Please enter a valid Number";
        } else {
            Number myNumber = new Number();
            myNumber.number = Integer.parseInt(userNumber.getText().toString());
            if (myNumber.isSquare()) {
                if (myNumber.isTriangular()) {
                    message = myNumber.number + " is both Square and Triangular";
                } else {
                    message = myNumber.number + " is Square";
                }
            } else if (myNumber.isTriangular()) {
                message = myNumber.number + " is Triangular";
            } else {
                message = myNumber.number + "is Nothing";
            }

//System.out.println(myNumber.isSquare());
        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}