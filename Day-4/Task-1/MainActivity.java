package com.example.androidtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText c;
    EditText java;
    EditText android;
    EditText asp;
    EditText php;
    TextView marks;

    Button btn;
    int cn,j,an,as,ph;
    int ans=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        marks=(TextView)findViewById(R.id.ans);
        c=(EditText)findViewById(R.id.editc);
        java=(EditText)findViewById(R.id.edit_java);
        android=(EditText)findViewById(R.id.edit_android);
        asp=(EditText)findViewById(R.id.edit_asp);
        php=(EditText)findViewById(R.id.edit_php);
        btn=(Button)findViewById(R.id.submit_button);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cn=Integer.parseInt(c.getText().toString());
                j=Integer.parseInt(java.getText().toString());
                an=Integer.parseInt(android.getText().toString());
                as=Integer.parseInt(asp.getText().toString());
                ph=Integer.parseInt(php.getText().toString());

                ans=Math.round(((cn+j+an+as+ph)*100)/500);

                if (ans >= 80){
                    Toast.makeText(MainActivity.this, "Grade = AA", Toast.LENGTH_LONG).show();
                } else if(ans >=75 || ans<=84){
                    Toast.makeText(MainActivity.this, "Grade = AB", Toast.LENGTH_LONG).show();
                }
                else if (ans >=65 || ans<=74){
                    Toast.makeText(MainActivity.this, "Grade = BB", Toast.LENGTH_LONG).show();
                }
                else if (ans >=55 || ans<=64){
                    Toast.makeText(MainActivity.this, "Grade = BC", Toast.LENGTH_LONG).show();
                }
                else if (ans >=45 || ans<=54){
                    Toast.makeText(MainActivity.this, "Grade = CC", Toast.LENGTH_LONG).show();
                }
                else if (ans >=40 || ans<=44){
                    Toast.makeText(MainActivity.this, "Grade = CD", Toast.LENGTH_LONG).show();
                }
                else if (ans >=35 || ans<=39){
                    Toast.makeText(MainActivity.this, "Grade = DD", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Grade = FF", Toast.LENGTH_LONG).show();
                }


                marks.setText("Percentage ="+ans+"%");



            }
        });
        marks=(TextView)findViewById(R.id.ans);
    }


}