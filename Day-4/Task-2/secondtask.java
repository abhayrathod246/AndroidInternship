package com.example.androidtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class secondtask extends AppCompatActivity {

    EditText editText;
    Button btn;
    TextView textView;
    int value = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondtask);

        editText=(EditText)findViewById(R.id.number);
        textView=(TextView)findViewById(R.id.ans);
        btn=(Button)findViewById(R.id.submit_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value=Integer.parseInt(editText.getText().toString());

                if(value <= 10){
                    textView.setText("Square of "+value+" is = "+value*value);
                }
                else {
                    Toast.makeText(secondtask.this, "Enter less than 10", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}