package com.example.shayriop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class big_shayri_screen extends AppCompatActivity {
String shayri="kdk";
TextView shayri_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_shayri_screen);
        shayri_text= findViewById(R.id.big_screen);
        shayri=getIntent().getStringExtra("shayri");
        shayri_text.setText(shayri);
    }
}