package com.example.androidtaskday8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class listview_detail extends AppCompatActivity {

    ImageView imageView;
    TextView tvnamedetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_detail);

        imageView=findViewById(R.id.ivimage);
        tvnamedetail=findViewById(R.id.tvnamedetails);
        Intent intent=getIntent();
        int image = intent.getIntExtra("image",R.drawable.one);
        imageView.setImageResource(image);
        String name=intent.getStringExtra("name");
        tvnamedetail.setText(name);




    }
}