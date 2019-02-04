package com.example.newmp4calculatorjordanmurphy;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button addition, subtraction, multiplication;
    private TextView textView;
    private EditText numberOne, numberTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        addition = (Button) findViewById(R.id.addition);
        subtraction = (Button) findViewById(R.id.subtraction);
        multiplication = (Button) findViewById(R.id.multiplication);
        numberOne = (EditText) findViewById(R.id.numberOne);
        numberTwo = (EditText) findViewById(R.id.numberTwo);
        textView = (TextView) findViewById(R.id.textView);
        addition.setOnClickListener(this);
        subtraction.setOnClickListener(this);
        multiplication.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String num1 = numberOne.getText().toString();
        String num2 = numberTwo.getText().toString();
        switch (view.getId()) {
            case R.id.addition:
                int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                textView.setText("Addition : " + String.valueOf(addition));
                break;
            case R.id.subtraction:
                int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                textView.setText("Subtraction : " + String.valueOf(subtraction));
                break;
            case R.id.multiplication:
                int multiplication = Integer.parseInt(num1) * Integer.parseInt(num2);
                textView.setText("Multiplication : " + String.valueOf(multiplication));
                break;
        }
    }
}
