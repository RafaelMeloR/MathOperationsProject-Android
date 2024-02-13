package com.example.mathoperationsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button calculateButton;
    private EditText inputStringNumber1;
    private EditText inputStringNumber2;
    private TextView additionStringTextView;
    private TextView sustractionStringTextView;
    private TextView divisionStringTextView;
    private TextView multiplicationStringTextView;
    private String addResult;
    private String susResult;
    private String divResult;
    private String mulResult;
    private double numberA;
    private double numberB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculateButton = (Button) findViewById(R.id.calculate_button);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputStringNumber1= (EditText) findViewById(R.id.input_string_number1);
                inputStringNumber2= (EditText) findViewById(R.id.input_string_number2);
                numberA = Double.parseDouble( inputStringNumber1.getText().toString());
                numberB = Double.parseDouble( inputStringNumber2.getText().toString());
                addResult=Double.toString((numberA+numberB));
                susResult=Double.toString((numberA-numberB));
                divResult=Double.toString((numberA/numberB));
                mulResult=Double.toString((numberA*numberB));
                additionStringTextView = (TextView)  findViewById(R.id.addition_string_text_view);
                additionStringTextView.setText(String.format("Addition: %s", addResult));
                sustractionStringTextView = (TextView)  findViewById(R.id.sustraction_string_text_view);
                sustractionStringTextView.setText(String.format("Sustraction: %s", susResult));
                divisionStringTextView = (TextView)  findViewById(R.id.division_string_text_view);
                divisionStringTextView.setText(String.format("Division: %s", divResult));
                multiplicationStringTextView = (TextView)  findViewById(R.id.multiplication_string_text_view);
                multiplicationStringTextView.setText(String.format("Multiplication: %s", mulResult));
            }
        });

    }



}