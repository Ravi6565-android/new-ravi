package com.example.shayriop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.Random;

public class big_shayri_screen extends AppCompatActivity implements View.OnClickListener {
String shayri="kdk";
Button pre,next;
TextView txtcounter;
ImageButton ibtntheme,theme_changer,edit,share,copy;

int posi=0,size=0;
ArrayList<String> temp= new ArrayList<>();
TextView shayri_text;
GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_shayri_screen);
        init();
        shayri_text= findViewById(R.id.big_screen);
        //shayri=getIntent().getStringExtra("shayri");
        temp=getIntent().getStringArrayListExtra("shayri");
        posi=getIntent().getIntExtra("position",0);
        shayri_text.setText(temp.get(posi));
         size= temp.size();
        System.out.println("size=="+size);
        txtcounter.setText(""+(posi+1)+"/"+size);


    }

    public void init() {
        pre = findViewById(R.id.pre);
        next = findViewById(R.id.next);
        txtcounter = findViewById(R.id.txtcounter);
        ibtntheme = findViewById(R.id.ibtntheme);
        theme_changer = findViewById(R.id.ibtnchange_theme);
        edit = findViewById(R.id.ibtnedit);
        share=findViewById(R.id.ibtnshare);
        copy=findViewById(R.id.ibtncopy);
        pre.setOnClickListener(this);
        next.setOnClickListener(this);
        ibtntheme.setOnClickListener(this);
        theme_changer.setOnClickListener(this);
        edit.setOnClickListener(this);
        share.setOnClickListener(this);
        copy.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if(view.getId()==pre.getId()){
            if(posi!=0) {
                posi--;
            }

            txtcounter.setText((posi+1)+"/"+size);
            shayri_text.setText(temp.get(posi));
        }
        if(view.getId()==next.getId()){
            if(posi!=temp.size()-1) {
                posi++;
            }
            txtcounter.setText((posi+1)+"/"+size);
            shayri_text.setText(temp.get(posi));
        }
        if(view.getId()==ibtntheme.getId()){
            BottomSheetDialog dialog= new BottomSheetDialog(this);
            dialog.setContentView(R.layout.gridview_for_big_shayri);
            gridView=dialog.findViewById(R.id.grid_big);
            grid_adpter_for_themes grid_adpter_for_themes= new grid_adpter_for_themes(big_shayri_screen.this,themes.themesop);
            gridView.setAdapter(grid_adpter_for_themes);
            gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    shayri_text.setBackgroundResource(themes.themesop[i]);
                    dialog.cancel();
                }
            });
            dialog.show();

        }
        if(view.getId()==theme_changer.getId()){
            int min=0,max=7;
            int r= new Random().nextInt(max-min)+min;{
                shayri_text.setBackgroundResource(themes.themesop[r]);
            }
        }
        if(view.getId()==edit.getId()){
            Intent intent= new Intent(big_shayri_screen.this,edit_activity.class);
           intent.putExtra("shayri",temp.get(posi));
            startActivity(intent);
        }
        if(view.getId()==share.getId()){
            Intent txtIntent = new Intent(android.content.Intent.ACTION_SEND);
            txtIntent .setType("text/plain");
            txtIntent .putExtra(android.content.Intent.EXTRA_SUBJECT,"shayri");
            txtIntent .putExtra(android.content.Intent.EXTRA_TEXT, shayri_text.getText());
            startActivity(Intent.createChooser(txtIntent ,"Share"));
        }
        if(view.getId()==copy.getId()){
            ClipboardManager clipboardManager= (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip=ClipData.newPlainText("copy",shayri_text.getText());
            clipboardManager.setPrimaryClip(clip);
            Toast.makeText(this, "text copied", Toast.LENGTH_LONG).show();
        }

    }
}
