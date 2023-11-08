package com.example.registerform_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivityView extends AppCompatActivity {

    TextView nameO, emailO, phoneO, passwordO;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_view);

        nameO = findViewById(R.id.name);
        emailO = findViewById(R.id.email);
        phoneO = findViewById(R.id.phone);
        passwordO = findViewById(R.id.password);

        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String email = i.getStringExtra("email");
        String phone = i.getStringExtra("phone");
        String password = i.getStringExtra("password");

        nameO.setText(String.valueOf(name));
        emailO.setText(String.valueOf(email));
        phoneO.setText(String.valueOf(phone));
        passwordO.setText(String.valueOf(password));

    }
}