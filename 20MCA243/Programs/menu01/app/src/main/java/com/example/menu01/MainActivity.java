package com.example.menu01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_item_home) {
            Toast.makeText(getApplicationContext(), "Home clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.menu_item_settings) {
            Toast.makeText(getApplicationContext(), "Settings clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.menu_item_about) {
            Toast.makeText(getApplicationContext(), "About clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.menu_item_help) {
            Toast.makeText(getApplicationContext(), "Help clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.menu_item_logout) {
            Toast.makeText(getApplicationContext(), "Logout clicked", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
