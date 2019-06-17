package com.example.clickarithmetic;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private EditText number1;
    private EditText number2;
    double result;
    String strResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("DefaultLocale")
    public void ShowData_Click(View v) {
        number1 = findViewById(R.id.nr1);
        number2 = findViewById(R.id.nr2);

        result = Double.valueOf(number1.getText().toString()) + Double.valueOf(number2.getText().toString());

        if (result == (int) result)
            strResult = String.format("%d", (int) result);
        else
            strResult = String.format("%s", result);

        Toast.makeText(getApplicationContext(), strResult,
                Toast.LENGTH_LONG).show();

        goToSecondPage();
    }

//TODO: pass parameter to second page
    public void goToSecondPage()
    {
        Intent openSecondPage = new Intent(this, SecondActivity.class);
        startActivity(openSecondPage);

    }


}
