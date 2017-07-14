package com.example.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

/*
*<TextView
            android:layout_width="match_parent"
            android:layout_height="90dp"
            android:id="@+id/textView"
            android:text=""
            android:textSize="80dp"
            android:background="#e0e0e0"
            android:fadingEdge="horizontal"
            android:textColor="#000000"
            android:scrollHorizontally="true"
            android:maxLines="1"
            android:scrollbars="none"/>
* */

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
        textView.setHorizontallyScrolling(true);
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
        Log.e("Clicked", "7");
        updateInput();
        //calculate();
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
        if(number != "" && number != "."){
            showUser += "+";
            userInput.add(number);
            userInput.add("+");
            number = "";
            updateInput();
        }

        }
    public static void clickedMinus(View view){
        if(number != "" && number != "."){}
        showUser += "-";
        userInput.add(number);
        userInput.add("-");
        number = "";
        updateInput();
    }
    public static void clickedMult(View view){
        if(number != "" && number != "."){}
        showUser += "x";
        userInput.add(number);
        userInput.add("*");
        number = "";
        updateInput();
    }
    public static void clickedDiv(View view){
        if(number != "" && number != "."){}
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
        Log.e("IN", "calculate()");
        int lastIndex = userInput.size()-1;
        boolean isOperator;
        ArrayList<Double> numbers = new ArrayList<>();
        ArrayList<String> operators = new ArrayList<>();
        try{
        isOperator = userInput.get(lastIndex) == "+" || userInput.get(lastIndex) == "-" ||userInput.get(lastIndex) == "*" ||userInput.get(lastIndex) == "/";}
        catch (Exception e){
            isOperator= false;
            Log.e("Stuck", "141");
        }
        if(number!= "" && isOperator){

            for (int i =0 ; i < userInput.size(); i++){
                try{
                  Double number1 =   Double.parseDouble(userInput.get(i));
                    numbers.add(number1);
                }
                catch (Exception e){
                    operators.add(userInput.get(i));
                }
            }
            Double number1 = Double.parseDouble(number);
            numbers.add(number1);

            while (operators.size() >= 1){
                Log.e("While loop", operators.size()+"");
                while(operators.contains("*")){
                    int index = operators.indexOf("*");
                    double firstNumber = numbers.get(index);
                    double secondNumber = numbers.get(index+1);
                    operators.remove(index);
                    numbers.remove(index+1);
                    numbers.remove(index);
                    double newNumber = firstNumber * secondNumber;
                    numbers.add(index,newNumber);
                    Log.e("While loop", "165");
                }
                while (operators.contains("+")){
                    int index = operators.indexOf("+");
                    double firstNumber = numbers.get(index);
                    double secondNumber = numbers.get(index+1);
                    operators.remove(index);
                    numbers.remove(index+1);
                    numbers.remove(index);
                    double newNumber = firstNumber + secondNumber;
                    numbers.add(index,newNumber);
                    Log.e("While loop", "165");
                }
            }
            answer.setText(numbers.get(0)+"");
        }


    }

}
