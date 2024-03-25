package com.almirlima.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private String operand;
    private double firstNumber;
    private EditText editText2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextNumber);
        editText2 = findViewById(R.id.editTextNumber2);
        resultado = findViewById(R.id.textView3);

        findViewById(R.id.button_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand = "+";
                firstNumber = Double.parseDouble(editText.getText().toString());
            }
        });

        findViewById(R.id.button_subtract).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand = "-";
                firstNumber = Double.parseDouble(editText.getText().toString());
            }
        });

        findViewById(R.id.button_multiply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand = "*";
                firstNumber = Double.parseDouble(editText.getText().toString());
            }
        });

        findViewById(R.id.button_divide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand = "/";
                firstNumber = Double.parseDouble(editText.getText().toString());
            }
        });
        findViewById(R.id.button_equals).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double secondNumber = Double.parseDouble(editText2.getText().toString());
                double result = 0;

                switch (operand) {
                    case "+":
                        result = firstNumber + secondNumber;
                        break;
                    case "-":
                        result = firstNumber - secondNumber;
                        break;
                    case "*":
                        result = firstNumber * secondNumber;
                        break;
                    case "/":
                        if (secondNumber != 0) {
                            result = firstNumber / secondNumber;
                        } else {
                            editText.setText("Error");
                        }
                        break;
                }

                resultado.setText(String.valueOf(result));
            }
        });

    }

}