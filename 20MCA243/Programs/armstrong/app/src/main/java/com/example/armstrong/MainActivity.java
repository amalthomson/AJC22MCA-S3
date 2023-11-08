package com.example.armstrong;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private EditText editTextNumber;
    private Button buttonCheck;
    private TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber = findViewById(R.id.editTextNumber);
        buttonCheck = findViewById(R.id.buttonCheck);
        textViewResult = findViewById(R.id.textViewResult);
        buttonCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editTextNumber.getText().toString().trim();
                if (!input.isEmpty()) {
                    int number = Integer.parseInt(input);
                    boolean isArmstrong = isArmstrongNumber(number);
                    String result = isArmstrong ? "Armstrong Number" : "Not an Armstrong Number";
                    textViewResult.setText(result);
                } else {
                    textViewResult.setText("Please enter a number.");
                }
            }
        });
    }
    private boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int result = 0;
        int n = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            result += Math.pow(digit, n);
            num /= 10;
        }
        return originalNum == result;
    }
}
