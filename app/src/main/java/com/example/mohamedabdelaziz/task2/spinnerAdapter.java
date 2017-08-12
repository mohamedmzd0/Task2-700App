package com.example.mohamedabdelaziz.task2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mohamed Abd Elaziz on 8/12/2017.
 */

public class spinnerAdapter extends BaseAdapter {

    ArrayList<String> list;
    Context context ;

    public spinnerAdapter(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView =layoutInflater.inflate(R.layout.item,null) ;
        TextView textView = (TextView) convertView.findViewById(R.id.tv);
        textView.setText(list.get(position));
        return convertView;
    }
}
