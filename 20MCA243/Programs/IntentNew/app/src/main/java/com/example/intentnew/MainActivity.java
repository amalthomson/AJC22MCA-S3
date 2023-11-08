package com.example.intentnew;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = text.getText().toString();
                //Toast.makeText(MainActivity.this, String.valueOf(txt), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("name", txt);
                startActivity(i);
            }
        });
    }
}