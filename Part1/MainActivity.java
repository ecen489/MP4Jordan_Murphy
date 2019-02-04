package com.example.mp4_part1_jordan_murphy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText edittext;
    Button button;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext = (EditText) findViewById(R.id.editText1);
        button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(this);
        textview = (TextView) findViewById(R.id.textView1);

    }

    @Override
    public void onClick(View view) {
        String value = edittext.getText().toString();
        textview.setText(value);

    }

}
