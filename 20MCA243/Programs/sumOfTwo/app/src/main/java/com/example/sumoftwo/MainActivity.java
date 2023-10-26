package com.example.sumoftwo;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button b;
    EditText ed1, ed2;
    TextView t1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.eid1);
        ed2=findViewById(R.id.eid2);
        t1=findViewById(R.id.txtid);
        b=findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val1=ed1.getText().toString();
                String val2=ed2.getText().toString();
                Integer x=Integer.parseInt(val1);
                Integer y=Integer.parseInt(val2);
                Integer sum=x+y;
                //t1.setText("Sum is: "+sum);
                //t1.setText(String.valueOf(sum));
                //t1.setText(sum.toString());
                //Toast.makeText(MainActivity.this, "Sum is: "+sum, Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, String.valueOf(sum), Toast.LENGTH_SHORT).show();
            }
        });
    }
}