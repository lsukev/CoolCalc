package com.lsukev.coolcalc;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class CalcActivity extends Activity {

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
        TextView lblResults = (TextView) findViewById(R.id.lblResults);

        btnOne.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

            }
        });
        btnCalc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

            }
        });

    }
}
