package com.example.shayriop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class big_shayri_screen extends AppCompatActivity implements View.OnClickListener {
String shayri="kdk";
Button pre,next;
TextView txtcounter;

int posi=0,size=0;
ArrayList<String> temp= new ArrayList<>();
TextView shayri_text;
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

    public void init(){
        pre=findViewById(R.id.pre);
        next=findViewById(R.id.next);
        txtcounter=findViewById(R.id.txtcounter);
        pre.setOnClickListener(this);
        next.setOnClickListener(this);
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
    }
}