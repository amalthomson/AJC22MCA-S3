package com.example.newgridlayout;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String[] brands = {"Apple", "Moto", "Samsung", "Sony", "Xiaomi",
            "Oppo", "Oneplus", "Vivo", "RealMe", "Redmi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.gridView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, brands);

        gridView.setAdapter(adapter);
    }
}
