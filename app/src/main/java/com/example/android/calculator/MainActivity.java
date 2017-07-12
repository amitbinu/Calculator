package com.example.android.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static ArrayList<String> userInput = new ArrayList<>();
    private static String number = "";
    private static String showUser = "";
    private static TextView textView;
    private static TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        answer = (TextView) findViewById(R.id.answer);
    }

    public static void clicked1(View view){
        number += "1";
        showUser+="1";
        updateInput();
        calculate();
    }
    public static void clicked2(View view){
        number += "2";
        showUser+="2";
        updateInput();
        calculate();
    }
    public static void clicked3(View view){
        number += "3";
        showUser+="3";
        updateInput();
        calculate();
    }
    public static void clicked4(View view){
        number += "4";
        showUser+="4";
        updateInput();
        calculate();
    }
    public static void clicked5(View view){
        number += "5";
        showUser+="5";
        updateInput();
        calculate();
    }
    public static void clicked6(View view){
        number += "6";
        showUser+="6";
        updateInput();
        calculate();
    }
    public static void clicked7(View view){
        number += "7";
        showUser+="7";
        updateInput();
        calculate();
    }
    public static void clicked8(View view){
        number += "8";
        showUser+="8";
        updateInput();
        calculate();

    }
    public static void clicked9(View view){
        number += "9";
        showUser+="9";
        updateInput();
        calculate();
    }

    public static void clickedDot(View view){
        number+= ".";
        showUser+=".";
        updateInput();
    }
    public static void clickedPlus(View view){
        if(! (userInput.size() < 1)){
            showUser += "+";
            userInput.add(number);
            userInput.add("+");
            number = "";
            updateInput();
        }

        }
    public static void clickedMinus(View view){
        if(! (userInput.size() < 1)){}
        showUser += "-";
        userInput.add(number);
        userInput.add("-");
        number = "";
        updateInput();
    }
    public static void clickedMult(View view){
        if(! (userInput.size() < 1)){}
        showUser += "x";
        userInput.add(number);
        userInput.add("*");
        number = "";
        updateInput();
    }
    public static void clickedDiv(View view){
        if(! (userInput.size() < 1)){}
        showUser += "\u00F7";
        userInput.add(number);
        userInput.add("/");
        number = "";
        updateInput();
    }
    public static void updateInput(){
        textView.setText(showUser);
    }

    public static void clickedEqual(View view){

    }

    public static void calculate(){
        int lastIndex = userInput.size()-1;
        boolean isOperator = false;
        try{
        isOperator = userInput.get(lastIndex) == "+" || userInput.get(lastIndex) == "-" ||userInput.get(lastIndex) == "*" ||userInput.get(lastIndex) == "/";}
        catch (Exception e){

        }
        if(number!= "" && isOperator){
            for (int i =0 ; i < userInput.size(); i++){
                try{
                  Double number =   Double.parseDouble(userInput.get(i));
                }
                catch (Exception e){

                }
            }
        }
    }

}
