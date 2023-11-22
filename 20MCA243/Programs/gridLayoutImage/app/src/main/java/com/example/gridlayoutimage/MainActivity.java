package com.example.gridlayoutimage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String[] fruitNames = {"Apple", "Banana", "Orange", "Grapes"};
    int[] fruitImages = {R.drawable.apple, R.drawable.banana,
            R.drawable.orange, R.drawable.grapes};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.gridview);
        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
    }

    private class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return fruitNames.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.grid_view, null);

            TextView fruitName = view.findViewById(R.id.fruit_name);
            ImageView fruitImage = view.findViewById(R.id.fruit_image);

            fruitName.setText(fruitNames[position]);
            fruitImage.setImageResource(fruitImages[position]);

            fruitImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, fruitNames[position], Toast.LENGTH_SHORT).show();
                }
            });

            return view;
        }
    }
}
