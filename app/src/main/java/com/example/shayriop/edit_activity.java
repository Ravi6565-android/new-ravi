package com.example.shayriop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class edit_activity extends AppCompatActivity implements View .OnClickListener{

    TextView eshayri;
    Button bg,txtcolor,font,txtsize,shareimage,emoji;
    GridView gridView;
String string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        string=getIntent().getStringExtra("shayri");
        init();
        eshayri.setText(string);
    }
    public void init(){
        eshayri=findViewById(R.id.edit_shayri);

     //buttons
        bg=findViewById(R.id.edit_back);
        txtcolor=findViewById(R.id.edit_color);
        font=findViewById(R.id.edit_font);
        txtsize= findViewById(R.id.edit_textsize);
        emoji= findViewById(R.id.edit_emoji);
        shareimage=findViewById(R.id.edit_share);

        //buttons on click listners
        bg.setOnClickListener(this);
        txtcolor.setOnClickListener(this);
        txtsize.setOnClickListener(this);
        shareimage.setOnClickListener(this);
        emoji.setOnClickListener(this);
        font.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==bg.getId()){
            BottomSheetDialog dialog = new BottomSheetDialog(edit_activity.this);
            dialog.setContentView(R.layout.gridview_for_big_shayri);
            grid_adpter_for_themes adpter = new grid_adpter_for_themes(edit_activity.this,themes.themesop);
            gridView=dialog.findViewById(R.id.grid_big);
            gridView.setAdapter(adpter);
            dialog.show();
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    eshayri.setBackgroundResource(themes.themesop[i]);
                }
            });

        }
        if(view.getId()==txtcolor.getId()){
            BottomSheetDialog dialog = new BottomSheetDialog(edit_activity.this);
            dialog.setContentView(R.layout.gridview_for_big_shayri);
            grid_adpter_for_themes adpter = new grid_adpter_for_themes(edit_activity.this,themes.colors);
            gridView=dialog.findViewById(R.id.grid_big);
            gridView.setAdapter(adpter);
            dialog.show();
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    eshayri.setTextColor(getResources().getColor(themes.colors[i]));
                }
            });

        }
        if(view.getId()==emoji.getId()){
            BottomSheetDialog dialog= new BottomSheetDialog(edit_activity.this);
            dialog.setContentView(R.layout.gridview_for_big_shayri);
            gridView=dialog.findViewById(R.id.grid_big);
          emoji_adapter adpter = new emoji_adapter(edit_activity.this,themes.emoji);
            gridView.setAdapter(adpter);
            dialog.show();
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    eshayri.setText(""+themes.emoji[i]+"\n"+string+"\n"+themes.emoji[i]);
                }
            });
        }
        if(view.getId()==font.getId()){
            BottomSheetDialog dialog= new BottomSheetDialog(edit_activity.this);
            dialog.setContentView(R.layout.gridview_for_big_shayri);
            gridView=dialog.findViewById(R.id.grid_big);
          emoji_adapter adpter = new emoji_adapter(edit_activity.this,themes.emoji);
            gridView.setAdapter(adpter);
            dialog.show();
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    eshayri.setText(""+themes.emoji[i]+"\n"+string+"\n"+themes.emoji[i]);
                }
            });
        }
    }
}