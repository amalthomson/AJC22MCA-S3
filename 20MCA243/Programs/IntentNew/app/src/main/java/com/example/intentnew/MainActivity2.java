package com.example.intentnew;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity2 extends AppCompatActivity {
    TextView textV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textV = findViewById(R.id.textV);
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        textV.setText(String.valueOf(name));
    }
}