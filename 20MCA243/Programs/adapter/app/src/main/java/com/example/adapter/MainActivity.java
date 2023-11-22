package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    String courseList[] = {"JAVA", "PYTHON", "DART"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList  = (ListView) findViewById(R.id.listView);

        ArrayAdapter < String > arrayAdapter = new ArrayAdapter<>(this, R.layout.list_item, R.id.textView, courseList);
        simpleList.setAdapter(arrayAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String item = (String) simpleList.getItemAtPosition(position);
                Toast toast = Toast.makeText(getApplicationContext(), "Selected Language is: " +item, Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 30, 150);
                toast.show();
            }
        });

    }
}