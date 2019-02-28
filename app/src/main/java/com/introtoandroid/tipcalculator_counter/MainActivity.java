package com.introtoandroid.tipcalculator_counter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioButton button10;
    private RadioButton button15;
    private RadioButton button20;
    private RadioButton buttonOther;
    private RadioGroup radioGroup;
    private Button reset;
    private Button calc;
    private EditText amount;
    private EditText number;
    private EditText otherNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button10 = (RadioButton) findViewById(R.id.radioButton);
        button15 = (RadioButton) findViewById(R.id.radioButton2);
        button20 = (RadioButton) findViewById(R.id.radioButton3);
        buttonOther = (RadioButton) findViewById(R.id.radioButton4);
        calc = (Button) findViewById(R.id.calculate);
        reset = (Button) findViewById(R.id.reset);
        amount = (EditText) findViewById(R.id.amount);
        number = (EditText) findViewById(R.id.number);
        otherNum = (EditText) findViewById(R.id.otherNum);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Touched calculate", Toast.LENGTH_SHORT).show();
                int checkNum = Integer.parseInt(amount.getText().toString());
                int numPeople = Integer.parseInt(number.getText().toString());
                double tipValue = 0.0;

                if(button10.isChecked() == true){
                     tipValue = .10;
                }
                else if(button15.isChecked() == true){
                     tipValue = .15;
                }
                else if(button20.isChecked() == true){
                     tipValue = .20;
                }
                else if(buttonOther.isChecked() == true){
                    if(otherNum != null){
                        int otherTipVal = Integer.parseInt(otherNum.getText().toString());
                        tipValue = (double) otherTipVal/100.0;
                    }

                }
                double valueOfTip = calculate(checkNum, numPeople,tipValue);
            }


        });


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Touched reset", Toast.LENGTH_SHORT).show();

            }


        });


    }

    public static final double calculate(int checkNum, int numPeople, double tipValue) {
        //Parsed amountincheck to double in order to multiply tip
        //For Edit texts need to set the value that can be received as ints or doubles
        //Need to check to see which one works with the way code is set up currently
        //Also changed method return to double because of tip type

        double amountInCheck = (double) checkNum;
        int peopleSplitting = numPeople;
        double total = 0.0;
        double tip = tipValue;

        total = amountInCheck * tip;
        total = total / peopleSplitting;

        return total;
    }

}


