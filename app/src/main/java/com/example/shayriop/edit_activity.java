package com.example.shayriop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

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
            String type="emoji";
          emoji_adapter adpter = new emoji_adapter(edit_activity.this,themes.emoji,type);
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
            String type="fonts";

            emoji_adapter adpter = new emoji_adapter(edit_activity.this,themes.fonts,type);
            gridView.setAdapter(adpter);
            dialog.show();
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Typeface typeface=Typeface.createFromAsset(getAssets(),themes.fonts[i]);
                    eshayri.setTypeface(typeface);

                }
            });
        }
        if(view.getId()==txtsize.getId()){
            BottomSheetDialog dialog= new BottomSheetDialog(this);
            dialog.setContentView(R.layout.text_size);
            SeekBar seekBar=dialog.findViewById(R.id.seekbar);
            dialog.show();
            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                    eshayri.setTextSize(i);
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        }
        if(view.getId()==shareimage.getId())
        {
            Bitmap icon = getBitmapFromView(eshayri);
            //Intent share = new Intent(Intent.ACTION_SEND);
            Intent share =new Intent(Intent.ACTION_SEND);
            share.setType("image/jpeg");
            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            icon.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
            int num=new Random().nextInt(2000);//20230331110105
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
            String currentDateandTime = sdf.format(new Date());

            File localFile = new File(themes.file.getAbsolutePath() + "/IMG_" + currentDateandTime + ".jpg");
            try
            {
                localFile.createNewFile();
                FileOutputStream fo = new FileOutputStream(localFile);
                fo.write(bytes.toByteArray());
                Toast.makeText(edit_activity.this,"File Downloaded",Toast.LENGTH_SHORT).show();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            share.putExtra(Intent.EXTRA_STREAM, Uri.parse(localFile.getAbsolutePath()));
            startActivity(Intent.createChooser(share, "Share Image"));
        }

    }
    private Bitmap getBitmapFromView(View view1)
    {
        //Define a bitmap with the same size as the view
        Bitmap returnedBitmap = Bitmap.createBitmap(view1.getWidth(), view1.getHeight(), Bitmap.Config.ARGB_8888);
        //Bind a canvas to it
        Canvas canvas = new Canvas(returnedBitmap);
        //Get the view's background
        Drawable bgDrawable = view1.getBackground();
        if (bgDrawable != null)
        {
            //has background drawable, then draw it on the canvas
            bgDrawable.draw(canvas);
        }
        else
        {
            //does not have background drawable, then draw white background on the canvas
            canvas.drawColor(Color.WHITE);
        }
        // draw the view on the canvas
        view1.draw(canvas);
        //return the bitmap
        return returnedBitmap;
    }
}