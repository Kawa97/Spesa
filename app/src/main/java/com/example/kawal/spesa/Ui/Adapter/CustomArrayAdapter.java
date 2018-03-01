package com.example.kawal.spesa.Ui.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.kawal.spesa.R;

import java.util.List;

/**
 * Created by kawal on 28/02/2018.
 */

public class CustomArrayAdapter extends ArrayAdapter<String> {
    private final Context context;
    public List<String> values;

    public CustomArrayAdapter(Context context, List<String> values) {
        super(context, R.layout.item_layout,values);
        this.values = values;
        this.context= context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.item_layout,null);

        TextView textView = (TextView) convertView.findViewById(R.id.labelname);
        String itemName = this.values.get(position);
        textView.setText(itemName);


        return convertView;
    }

}
