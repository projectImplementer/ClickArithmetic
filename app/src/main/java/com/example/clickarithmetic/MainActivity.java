package com.example.clickarithmetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private EditText number1;
    private EditText number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v)
    {
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.et_input1);
        number2 = findViewById(R.id.et_input2);

        goToSecondPage();
    }

//TODO: pass parameter to second page
    public void goToSecondPage(){
        Intent openSecondPage = new Intent(this, SecondActivity.class);
        startActivity(openSecondPage);
    }

    Integer num1;
    Integer num2;
    char operator;
    double answer = 0.0;

    Scanner scanObject = new Scanner(System.in);  // create Scanner type object.
    public void numberOneInput() {

       // Scanner scanObject = new Scanner(System.in);  // create Scanner type object.

        //System.out.println("The value of x is: ");
        num1 = scanObject.nextInt(); // the terminal waits for user input for num1.
    }


}
