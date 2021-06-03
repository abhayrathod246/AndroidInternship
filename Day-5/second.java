package com.example.androidtaskday5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class second extends AppCompatActivity {


    private TextView nameTextView,emailTextView,mobileTextView,collegeTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        nameTextView=findViewById(R.id.name);
        emailTextView=findViewById(R.id.email);
        mobileTextView=findViewById(R.id.mobile);
        collegeTextView=findViewById(R.id.college);

        String saName=getIntent().getStringExtra("keyname");
        String saEmail=getIntent().getStringExtra("keyemail");
        String saMobile=getIntent().getStringExtra("keymobile");
        String saCollege=getIntent().getStringExtra("keycollege");


        nameTextView.setText("Name = "+saName);
        emailTextView.setText("Email = "+saEmail);
        mobileTextView.setText("Mobile = "+saMobile);
        collegeTextView.setText("College = "+saCollege);


    }
}