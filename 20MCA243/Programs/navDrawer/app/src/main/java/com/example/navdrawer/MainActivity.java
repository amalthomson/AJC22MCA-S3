package com.example.navdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    DrawerLayout d1;
    ActionBarDrawerToggle acb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        d1=findViewById(R.id.dig);
        acb=new ActionBarDrawerToggle(this,d1,R.string.nav_open,R.string.nav_close);
        d1.addDrawerListener(acb);
        acb.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(acb.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }
}
