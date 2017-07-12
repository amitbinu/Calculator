package com.example.android.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
    }

    ArrayList<String> userInput = new ArrayList<>();
    private static String number = "";
    private static String operator = "";
    private static TextView textView;

    public static void clicked1(View view){
        number += "1";
        updateInput();
    }
    public static void clicked2(View view){
        number += "2";
        updateInput();
    }
    public static void clicked3(View view){
        Log.e("Number",view.getId()+"");
        number += "3";
        updateInput();
    }
    public static void clicked4(View view){
        number += "4";
        updateInput();
    }
    public static void clicked5(View view){
        number += "5";
        updateInput();
    }
    public static void clicked6(View view){
        number += "6";
        updateInput();
    }
    public static void clicked7(View view){
        number += "7";
        updateInput();
    }
    public static void clicked8(View view){
        number += "8";
        updateInput();

    }
    public static void clicked9(View view){
        number += "9";
        updateInput();
    }

    public static void updateInput(){
        textView.setText(number);
    }


}
