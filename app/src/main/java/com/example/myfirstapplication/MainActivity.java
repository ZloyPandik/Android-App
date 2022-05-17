package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumber3, editTextNumber2, editTextNumber;
    private TextView textView2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber = (EditText) findViewById(R.id.InputA);
        editTextNumber2 = (EditText) findViewById(R.id.InputB);
        editTextNumber3 = (EditText) findViewById(R.id.InputC);
        Button button = (Button) findViewById(R.id.Button);
        Button SortButton = (Button) findViewById(R.id.SortButton);
        TextView textView = (TextView) findViewById(R.id.Title);
        textView2 = (TextView) findViewById(R.id.Result);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                double a = Double.parseDouble(editTextNumber.getText().toString());
                double b = Double.parseDouble(editTextNumber2.getText().toString());
                double c = Double.parseDouble(editTextNumber3.getText().toString());
                double d = Math.pow(b, 2) - 4 * a * c;
                double x1 = (-b - Math.pow(d, 0.5)) / (2 * a);
                double x2 = (-b + Math.pow(d, 0.5)) / (2 * a);
                @SuppressLint("DefaultLocale") String Result1 = String.format("%.2f", x1);
                @SuppressLint("DefaultLocale") String Result2 = String.format("%.2f", x2);
                String ans = "x1 = " + String.valueOf(Result1) + "\n" + "x2 = " + String.valueOf(Result2);
                textView2.setText(ans);
                                      }
        });
    };
}