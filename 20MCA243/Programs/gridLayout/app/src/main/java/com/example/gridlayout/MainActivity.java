package com.example.gridlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gv;

    String c[]={"Tesla","Tata","Mercedes","Mclaren"};

    int img[]={R.drawable.tesla,R.drawable.tata,R.drawable.mercedes,R.drawable.mclaren};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv=findViewById(R.id.gv);

        CustomAdaptor ca=new CustomAdaptor(MainActivity.this,c,img);

        gv.setAdapter(ca);
    }
}