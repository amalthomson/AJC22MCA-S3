package com.example.oddeven;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText numberInput = findViewById(R.id.numberInput);
        Button checkButton = findViewById(R.id.checkButton);
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText = numberInput.getText().toString();
                if (inputText.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();
                } else {
                    int number = Integer.parseInt(inputText);

                    if (number % 2 == 0) {
                        Toast.makeText(MainActivity.this, number + " is EVEN", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, number + " is ODD", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
