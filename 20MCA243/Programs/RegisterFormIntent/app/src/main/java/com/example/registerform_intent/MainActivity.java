package com.example.registerform_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText name, email, phone, password;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        password = findViewById(R.id.password);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameN = name.getText().toString();
                String emailN = email.getText().toString();
                String phoneN = phone.getText().toString();
                String passwordN = password.getText().toString();

                Intent i = new Intent(MainActivity.this, MainActivityView.class);
                i.putExtra("name", nameN);
                i.putExtra("email", emailN);
                i.putExtra("phone", phoneN);
                i.putExtra("password", passwordN);
                startActivity(i);

            }
        });

    }
}