package com.example.shayriop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listcatogory;
ArrayList<String> typesOfshayri= new ArrayList<>();
ArrayList<Integer> image= new ArrayList<>();
catagory_custom_adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        fillimage();
        filltypesofshayri();
        adapter= new catagory_custom_adapter(MainActivity.this,typesOfshayri,image);
        listcatogory.setAdapter(adapter);
        on_Item_Click();


    }
    public void on_Item_Click(){
        listcatogory.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,subCatagory.class);

                   intent.putExtra("pos",i);
                   intent.putExtra("image",image.get(i));
                   startActivity(intent);

            }
        });
    }
    public void init(){
       listcatogory=findViewById(R.id.listCatagory);
    }
    public void filltypesofshayri(){
        typesOfshayri.add("शुभकामना शायरी");//ok
        typesOfshayri.add("दोस्ती शायरी");//ok
        typesOfshayri.add("मजेदार शायरी");//ok
        typesOfshayri.add("भगवान शायरी ");//ok
        typesOfshayri.add("प्रेरणा स्रोत शायरी");//ok
        typesOfshayri.add("जीवन शायरी");//ok
        typesOfshayri.add("मोहब्बत शायरी");//ok
        typesOfshayri.add("यादें शायरी");//ok
        typesOfshayri.add("अन्य  शायरी");//ok
        typesOfshayri.add("राजनीति शायरी");//ok
        typesOfshayri.add("प्रेम शायरी ");//ok
        typesOfshayri.add("दर्द शायरी");//ok
        typesOfshayri.add("बेवफा शायरी");//ok
        typesOfshayri.add("शराब शायरी ");//ok
        typesOfshayri.add("जन्मदिन शायरी ");//ok
        typesOfshayri.add("होली शायरी");//ok
    }
    public void fillimage(){
        image.add(R.drawable.bestwishesh);
        image.add(R.drawable.husband);
        image.add(R.drawable.child);
        image.add(R.drawable.god);
        image.add(R.drawable.motivational);
        image.add(R.drawable.kanjoos);
        image.add(R.drawable.married);
        image.add(R.drawable.officework);
        image.add(R.drawable.santabanta);
        image.add(R.drawable.politics);
        image.add(R.drawable.love);
        image.add(R.drawable.sad);
        image.add(R.drawable.bewfa);
        image.add(R.drawable.bearbar);
        image.add(R.drawable.birthday);
        image.add(R.drawable.holiimg);

    }
}