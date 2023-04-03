package com.example.shayriop;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class emoji_adapter extends BaseAdapter {
     String type;
    Context context;
    String[] emoji;

    public emoji_adapter(Context context, String[] emoji, String type) {
    this.context=context;
    this.emoji=emoji;
    this.type=type;
    }

    @Override
    public int getCount() {
        return emoji.length;
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
        TextView txt= view.findViewById(R.id.item_for_grid);

        if(type.equals("emoji")){
            txt.setText(emoji[i]);
        }else {

            Typeface typeface= Typeface.createFromAsset(context.getAssets(),emoji[i]);
            txt.setText("Ravi");
            txt.setTypeface(typeface);
        }
        return view;
    }
}
