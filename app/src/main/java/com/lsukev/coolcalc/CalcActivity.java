package com.lsukev.coolcalc;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class CalcActivity extends Activity {

    public enum Operation {
        ADD, SUBTRACT, DIVIDE, MULTIPLY, EQUAL
    }

    String runningNumber = "";
    String leftValue = "";
    String rightValue = "";
    Operation currentOperation;
    int result = 0;


    TextView lblResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        Button btnOne = (Button) findViewById(R.id.btnOne);
        Button btnTwo = (Button) findViewById(R.id.btnTwo);
        Button btnThree = (Button) findViewById(R.id.btnThree);
        Button btnFour = (Button) findViewById(R.id.btnFour);
        Button btnFive = (Button) findViewById(R.id.btnFive);
        Button btnSix = (Button) findViewById(R.id.btnSix);
        Button btnSeven = (Button) findViewById(R.id.btnSeven);
        Button btnEight = (Button) findViewById(R.id.btnEight);
        Button btnNine = (Button) findViewById(R.id.btnNine);
        Button btnZero = (Button) findViewById(R.id.btnZero);

        ImageButton btnAdd = (ImageButton) findViewById(R.id.btnAdd);
        ImageButton btnDivide = (ImageButton) findViewById(R.id.btnDivide);
        ImageButton btnMultiply = (ImageButton) findViewById(R.id.btnMultiply);
        ImageButton btnSubtract = (ImageButton) findViewById(R.id.btnSubtract);
        ImageButton btnCalc = (ImageButton) findViewById(R.id.btnCalc);

        Button btnClear = (Button) findViewById(R.id.btnClear);
        lblResults = (TextView) findViewById(R.id.lblResults);


        lblResults.setText("");

        btnOne.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                numberPressed(1);
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                numberPressed(2);
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                numberPressed(3);
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                numberPressed(4);
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                numberPressed(5);
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                numberPressed(6);
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                numberPressed(7);
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                numberPressed(8);
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                numberPressed(9);
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                numberPressed(0);
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                processOperation(Operation.ADD);
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                processOperation(Operation.MULTIPLY);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                processOperation(Operation.DIVIDE);
            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                processOperation(Operation.SUBTRACT);
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                runningNumber="";
                leftValue="";
                rightValue="";
                result=0;
                currentOperation=null;
                lblResults.setText("");
            }
        });
        btnCalc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                processOperation(Operation.EQUAL);
            }
        });
    }

    void processOperation(Operation operation){

        if (currentOperation != null){
            if (runningNumber != ""){
                rightValue = runningNumber;
                runningNumber="";

                switch (currentOperation) {
                    case ADD:
                        result = Integer.parseInt(leftValue) + Integer.parseInt(rightValue);
                        break;
                    case SUBTRACT:
                        result = Integer.parseInt(leftValue) - Integer.parseInt(rightValue);
                        break;
                    case MULTIPLY:
                        result = Integer.parseInt(leftValue) * Integer.parseInt(rightValue);
                        break;
                    case DIVIDE:
                        result = Integer.parseInt(leftValue) / Integer.parseInt(rightValue);
                        break;
                }
                leftValue = String.valueOf(result);
                lblResults.setText(leftValue);
            }

        } else {
            leftValue = runningNumber;
            runningNumber ="";
        }

        currentOperation = operation;
    }

    void numberPressed (int number){
        runningNumber += String.valueOf(number);
        lblResults.setText(runningNumber);
    }
}
