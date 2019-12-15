package com.akshayjadhav.currecyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    //Step1
    Button euro,doller,pound,yen,dinar,bitcoin,ruble,ausDoller,canDoller;
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step2
        euro = findViewById(R.id.euro);
        doller = findViewById(R.id.doller);
        pound = findViewById(R.id.pound);
        yen = findViewById(R.id.yen);
        dinar = findViewById(R.id.dinar);
        bitcoin = findViewById(R.id.bitcoin);
        ruble = findViewById(R.id.ruble);
        ausDoller = findViewById(R.id.ausDoller);
        canDoller = findViewById(R.id.canDoller);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        //Step3 For Euro
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //take input and save in variable in string format
                String euroInput = editText.getText().toString();
                //check input field in not empty
                if (TextUtils.isEmpty(euroInput)){
                    editText.setError("Empty User Input");
                }else {
                    double inputDoubleFormat , finalResult;
                    //input in double format
                    inputDoubleFormat = Double.parseDouble(euroInput);
                    textView.setText(null);
                    finalResult = inputDoubleFormat * 0.013;
                    //to format final result
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(finalResult));

                }

            }
        });

        //Step4 For DOller
        doller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //take input and save in variable in string format
                String dollerInput = editText.getText().toString();
                //check input field in not empty
                if (TextUtils.isEmpty(dollerInput)){
                    editText.setError("Empty User Input");
                }else {
                    double inputDoubleFormat , finalResult;
                    //input in double format
                    inputDoubleFormat = Double.parseDouble(dollerInput);
                    textView.setText(null);
                    finalResult = inputDoubleFormat * 0.014;
                    //to format final result
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(finalResult));

                }

            }
        });

        //Step5 For Pound
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //take input and save in variable in string format
                String poundInput = editText.getText().toString();
                //check input field in not empty
                if (TextUtils.isEmpty(poundInput)){
                    editText.setError("Empty User Input");
                }else {
                    double inputDoubleFormat , finalResult;
                    //input in double format
                    inputDoubleFormat = Double.parseDouble(poundInput);
                    textView.setText(null);
                    finalResult = inputDoubleFormat * 0.011;
                    //to format final result
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(finalResult));

                }

            }
        });

        //Step6 For Yen
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //take input and save in variable in string format
                String yenInput = editText.getText().toString();
                //check input field in not empty
                if (TextUtils.isEmpty(yenInput)){
                    editText.setError("Empty User Input");
                }else {
                    double inputDoubleFormat , finalResult;
                    //input in double format
                    inputDoubleFormat = Double.parseDouble(yenInput);
                    textView.setText(null);
                    finalResult = inputDoubleFormat * 1.55;
                    //to format final result
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(finalResult));

                }

            }
        });

        //Step7 For dinar
        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //take input and save in variable in string format
                String dinarInput = editText.getText().toString();
                //check input field in not empty
                if (TextUtils.isEmpty(dinarInput)){
                    editText.setError("Empty User Input");
                }else {
                    double inputDoubleFormat , finalResult;
                    //input in double format
                    inputDoubleFormat = Double.parseDouble(dinarInput);
                    textView.setText(null);
                    finalResult = inputDoubleFormat * 0.0043;
                    //to format final result
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(finalResult));

                }

            }
        });

        //Step8 For Bitcoin
        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //take input and save in variable in string format
                String bitcoinInput = editText.getText().toString();
                //check input field in not empty
                if (TextUtils.isEmpty(bitcoinInput)){
                    editText.setError("Empty User Input");
                }else {
                    double inputDoubleFormat , finalResult;
                    //input in double format
                    inputDoubleFormat = Double.parseDouble(bitcoinInput);
                    textView.setText(null);
                    finalResult = inputDoubleFormat * 499084.5;
                    //to format final result
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(finalResult));

                }

            }
        });

        //Step9 For ruble
        ruble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //take input and save in variable in string format
                String rubleInput = editText.getText().toString();
                //check input field in not empty
                if (TextUtils.isEmpty(rubleInput)){
                    editText.setError("Empty User Input");
                }else {
                    double inputDoubleFormat , finalResult;
                    //input in double format
                    inputDoubleFormat = Double.parseDouble(rubleInput);
                    textView.setText(null);
                    finalResult = inputDoubleFormat * 0.89;
                    //to format final result
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(finalResult));

                }

            }
        });

        //Step10 For AUSDoller
        ausDoller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //take input and save in variable in string format
                String ausDollerInput = editText.getText().toString();
                //check input field in not empty
                if (TextUtils.isEmpty(ausDollerInput)){
                    editText.setError("Empty User Input");
                }else {
                    double inputDoubleFormat , finalResult;
                    //input in double format
                    inputDoubleFormat = Double.parseDouble(ausDollerInput);
                    textView.setText(null);
                    finalResult = inputDoubleFormat * 0.021;
                    //to format final result
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(finalResult));

                }

            }
        });

        //Step11 For CANDoller
        canDoller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //take input and save in variable in string format
                String canDollerInput = editText.getText().toString();
                //check input field in not empty
                if (TextUtils.isEmpty(canDollerInput)){
                    editText.setError("Empty User Input");
                }else {
                    double inputDoubleFormat , finalResult;
                    //input in double format
                    inputDoubleFormat = Double.parseDouble(canDollerInput);
                    textView.setText(null);
                    finalResult = inputDoubleFormat * 0.019;
                    //to format final result
                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText(""+decimalFormat.format(finalResult));

                }

            }
        });


    }
}
