package com.example.activitystyle.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.activitystyle.R;

import java.util.List;

public class MyAdapter extends ArrayAdapter<MyIma> {
    private Integer resouseId;

    public MyAdapter(Context context, int resource, List<MyIma> objects) {
        super(context, resource, objects);
        resouseId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyIma myIma = getItem(position);
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resouseId, null);
        } else {
            view = convertView;
        }
        TextView textView = view.findViewById(R.id.textView2);
        ImageView imageView = view.findViewById(R.id.imageView);
        textView.setText(myIma.getText());
        imageView.setImageResource(myIma.getImageId());
        return view;
    }
}
