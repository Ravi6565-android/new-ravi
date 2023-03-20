package com.example.shayriop;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class subcatagory_custom_adapter extends BaseAdapter {
subCatagory subCatagory;
TextView txt1;
ImageView img;
ArrayList<String> dosti;
int image;

    public subcatagory_custom_adapter(subCatagory subCatagory, ArrayList<String> dosti, int image) {
    this.subCatagory=subCatagory;
    this.dosti=dosti;
    this.image=image;
    }

    @Override
    public int getCount() {
        return dosti.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
            view= LayoutInflater.from(subCatagory).inflate(R.layout.sub_items,viewGroup,false);
            txt1=view.findViewById(R.id.subitems_txt1);
            txt1.setText(dosti.get(i));
            img=view.findViewById(R.id.subitems_image);
            img.setImageResource(image);
        return view;
    }
}
