package com.example.loginpage;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private EditText email;
    private EditText password;
    private Button loginButton;
    private final String predefinedEmail = "amal@icloud.com";
    private final String predefinedPassword = "Amal@123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String enteredEmail = email.getText().toString();
                String enteredPassword = password.getText().toString();
                if (enteredEmail.equals(predefinedEmail) && enteredPassword.equals(predefinedPassword)) {
                    showToast("Login Successful");
                } else {
                    showToast("Invalid Email or Password");
                }
            }
        });
    }
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
