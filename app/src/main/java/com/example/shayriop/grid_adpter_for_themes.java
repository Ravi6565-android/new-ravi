package com.example.shayriop;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class grid_adpter_for_themes extends BaseAdapter {
    big_shayri_screen big_shayri_screen;
    int[] themesop;
    public grid_adpter_for_themes(big_shayri_screen big_shayri_screen, int[] themesop) {
        this.big_shayri_screen=big_shayri_screen;
        this.themesop=themesop;
    }

    @Override
    public int getCount() {
        return themesop.length;
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
        view= LayoutInflater.from(big_shayri_screen).inflate(R.layout.grid_items_for_bottom,viewGroup,false);
        TextView textView;
        textView=view.findViewById(R.id.item_for_grid);
        textView.setBackgroundResource(themesop[i]);
        return view;
    }
}
