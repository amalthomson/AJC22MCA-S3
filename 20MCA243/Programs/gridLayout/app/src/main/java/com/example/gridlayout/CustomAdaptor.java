package com.example.gridlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomAdaptor extends BaseAdapter {
    Context context;
    String c[];
    int img[];
    LayoutInflater layoutInflater;

    public CustomAdaptor(MainActivity mainActivity, String[] c, int[] img) {
        this.context = mainActivity;
        this.c = c;
        this.img = img;
        layoutInflater = (LayoutInflater.from(mainActivity));
    }

    @Override
    public int getCount() {
        return img.length;
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
        convertView = layoutInflater.inflate(R.layout.grid_layout, null);

        TextView tv = convertView.findViewById(R.id.tv);
        ImageView iv = convertView.findViewById(R.id.iv);

        tv.setText(c[position]);
        iv.setImageResource(img[position]);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, c[position], Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }
}
