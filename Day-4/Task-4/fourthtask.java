package com.example.androidtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class fourthtask extends AppCompatActivity {

    Button btn;
    TextView textView;
    EditText num1,num2;
    int a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthtask);

        num1=(EditText)findViewById(R.id.number1);
        num2=(EditText)findViewById(R.id.number2);


        textView=(TextView)findViewById(R.id.ans);
        btn=(Button)findViewById(R.id.submit_button);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Integer.parseInt(num1.getText().toString());
                b=Integer.parseInt(num2.getText().toString());


                if(a < b){
                    textView.setText("B is Gretest Number");
                }
                else if(a > b) {
                    textView.setText("A is Gretest Number");
                }
                else {
                    textView.setText("Both Number are Equal");
                }
            }
        });
    }
}