package com.example.androidtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Fifthtask extends AppCompatActivity {

    Button add,sub,mul,div;

    EditText num1,num2;
    int a,b,ans=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifthtask);


        num1=(EditText)findViewById(R.id.number1);
        num2=(EditText)findViewById(R.id.number2);

        add=(Button)findViewById(R.id.adition);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Integer.parseInt(num1.getText().toString());
                b=Integer.parseInt(num2.getText().toString());

                ans=a+b;
                Toast.makeText(Fifthtask.this, "sum ="+ans, Toast.LENGTH_SHORT).show();
            }
        });

        sub=(Button)findViewById(R.id.substraction);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans=a - b;
                Toast.makeText(Fifthtask.this, "Substraction"+ans, Toast.LENGTH_SHORT).show();
            }
        });

        mul=(Button)findViewById(R.id.multiplication);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans=a * b;
                Toast.makeText(Fifthtask.this, "Multiplication = "+ans, Toast.LENGTH_SHORT).show();
            }
        });

        div=(Button)findViewById(R.id.division);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans=a / b;
                Toast.makeText(Fifthtask.this, "Division = "+ans, Toast.LENGTH_SHORT).show();
            }
        });

    }
}

