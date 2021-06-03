package com.example.androidtaskday7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String course[] = {"PHP","ANDROID","JAVA","ASP","ENS","WNS","CNS","C",
            "C++","DBMS","JAVASCRIPT","ICT","PYTHON","C#"};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listviewid);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1,course);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(getApplicationContext(), course[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}