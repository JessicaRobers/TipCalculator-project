package com.introtoandroid.tipcalculator_counter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button10 = (RadioButton) findViewById(R.id.radioButton);
        button15 = (RadioButton) findViewById(R.id.radioButton2);
        button20 = (RadioButton) findViewById(R.id.radioButton3);
        buttonOther = (RadioButton) findViewById(R.id.radioButton4);
        calc = (Button)findViewById(R.id.calculate);
        reset = (Button)findViewById(R.id.reset);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Touched calculate", Toast.LENGTH_SHORT).show();

            }


        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Touched reset", Toast.LENGTH_SHORT).show();

            }


        });

    }

}


