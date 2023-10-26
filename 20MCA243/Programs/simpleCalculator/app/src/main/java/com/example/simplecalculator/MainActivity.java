package com.example.simplecalculator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private EditText num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        Button addButton = findViewById(R.id.add);
        Button subtractButton = findViewById(R.id.subtract);
        Button multiplyButton = findViewById(R.id.multiply);
        Button divideButton = findViewById(R.id.divide);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performCalculation("+");
            }
        });
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performCalculation("-");
            }
        });
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performCalculation("*");
            }
        });
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performCalculation("/");
            }
        });
    }
    private void performCalculation(String operator) {
        String num1Str = num1.getText().toString();
        String num2Str = num2.getText().toString();
        if (num1Str.isEmpty() || num2Str.isEmpty()) {
            showToast("Please enter both numbers.");
            return;
        }
        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        double result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    showToast("Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
                break;
        }
        showToast("Result: " + result);
    }
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
