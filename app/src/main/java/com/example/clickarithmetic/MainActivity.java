package com.example.clickarithmetic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        goToSecondPage();
    }

//TODO: pass parameter to second page somePage
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
