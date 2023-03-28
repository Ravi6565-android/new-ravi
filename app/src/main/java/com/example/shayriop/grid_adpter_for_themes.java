package com.example.shayriop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class grid_adpter_for_themes extends BaseAdapter {
   Context context;
    int[] themesop;
    public grid_adpter_for_themes(Context context, int[] themesop) {
        this.context=context;
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
        view= LayoutInflater.from(context).inflate(R.layout.grid_items_for_bottom,viewGroup,false);
        TextView textView;
        textView=view.findViewById(R.id.item_for_grid);
        textView.setBackgroundResource(themesop[i]);
        return view;
    }
}
