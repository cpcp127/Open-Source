package com.example.tester;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FoodAdpter extends BaseAdapter {
    private Context mContext = null;
    private int layout = 0;
    private ArrayList<Food> data = null;
    private LayoutInflater inflater = null;

    public FoodAdpter(Context c, int l, ArrayList<Food> d) {
        this.mContext = c;
        this.layout = l;
        this.data = d;
        this.inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = inflater.inflate(this.layout, parent, false);
        }
        ImageView Food_image = (ImageView) convertView.findViewById(R.id.imageView2);
        TextView Food_name = (TextView) convertView.findViewById(R.id.textView3);
        TextView Food_dis = (TextView) convertView.findViewById(R.id.textView6);



        Food_image.setImageBitmap(data.get(position).image);
        Food_name.setText(data.get(position).foodname);
        Food_dis.setText(data.get(position).discrip);


        return convertView;


    }
}
