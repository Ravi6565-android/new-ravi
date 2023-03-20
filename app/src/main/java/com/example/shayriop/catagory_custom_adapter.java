package com.example.shayriop;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class catagory_custom_adapter  extends BaseAdapter {
// for first layout
  MainActivity mainActivity;
  ArrayList<String> typesOfshayri;
    ArrayList<Integer> image;
  TextView catagoryType;
  ImageView catagoryImage;



    public catagory_custom_adapter(MainActivity mainActivity, ArrayList<String> typesOfshayri, ArrayList<Integer> image) {

    this.mainActivity=mainActivity;
    this.image=image;
    this.typesOfshayri=typesOfshayri;
    }



    @Override
    public int getCount() {
        return image.size();
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
        view= LayoutInflater.from(mainActivity).inflate(R.layout.catagory_items,viewGroup,false);
        catagoryImage = view.findViewById(R.id.catagoryImage);
        catagoryType = view.findViewById(R.id.catagoryType);
        catagoryImage.setImageResource(image.get(i));
        catagoryType.setText(typesOfshayri.get(i));
        return view;

    }
}
