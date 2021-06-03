package com.example.androidtaskday5;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText name,email,mobile,college;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText) findViewById(R.id.name);
        email=(EditText)findViewById(R.id.email);
        mobile=(EditText)findViewById(R.id.mobile);
        college=(EditText)findViewById(R.id.college);
        btn=(Button)findViewById(R.id.submit_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sname=name.getText().toString();
                String semail=email.getText().toString();
                String smobile=mobile.getText().toString();
                String scollege=college.getText().toString();

                Intent intent=new Intent(MainActivity.this,second.class);
                intent.putExtra("keyname",sname);
                intent.putExtra("keyemail",semail);
                intent.putExtra("keymobile",smobile);
                intent.putExtra("keycollege",scollege);

                startActivity(intent);
            }
        });

    }
}