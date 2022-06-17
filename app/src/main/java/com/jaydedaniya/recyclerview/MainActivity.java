package com.jaydedaniya.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewHorizontal, recyclerViewVertical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewHorizontal = findViewById(R.id.recyclerViewHorizontal);
        ArrayList<RecyclerViewHorizontal> listHorizontal = new ArrayList<>();

        listHorizontal.add(new RecyclerViewHorizontal(R.drawable.swiggy_1));
        listHorizontal.add(new RecyclerViewHorizontal(R.drawable.swiggy_3));
        listHorizontal.add(new RecyclerViewHorizontal(R.drawable.swiggy_4));
        listHorizontal.add(new RecyclerViewHorizontal(R.drawable.swiggy_5));
        listHorizontal.add(new RecyclerViewHorizontal(R.drawable.swiggy_6));
        listHorizontal.add(new RecyclerViewHorizontal(R.drawable.swiggy_7));
        listHorizontal.add(new RecyclerViewHorizontal(R.drawable.swiggy_8));

        recyclerViewHorizontal.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        RecyclerHorizontalAdapter horizontalAdapter =new RecyclerHorizontalAdapter(this,listHorizontal);
        recyclerViewHorizontal.setAdapter(horizontalAdapter);


        recyclerViewVertical = findViewById(R.id.recyclerViewVertical);
        ArrayList<RecyclerViewVertical> listVerticals = new ArrayList<>();

        listVerticals.add(new RecyclerViewVertical(R.drawable.swiggy_1,"First CardView","RecyclerView first card description","FIRST BUTTON"));
        listVerticals.add(new RecyclerViewVertical(R.drawable.swiggy_3,"Second CardView","RecyclerView Second card description","SECOND BUTTON"));
        listVerticals.add(new RecyclerViewVertical(R.drawable.swiggy_4,"Three CardView","RecyclerView Third card description","THREE BUTTON"));
        listVerticals.add(new RecyclerViewVertical(R.drawable.swiggy_5,"Four CardView","RecyclerView Four card description","FOUR BUTTON"));
        listVerticals.add(new RecyclerViewVertical(R.drawable.swiggy_6,"Five CardView","RecyclerView Five card description","FIVE BUTTON"));
        listVerticals.add(new RecyclerViewVertical(R.drawable.swiggy_7,"Six CardView","RecyclerView Six card description","SIX BUTTON"));
        listVerticals.add(new RecyclerViewVertical(R.drawable.swiggy_8,"Seven CardView","RecyclerView Seven card description","SEVEN BUTTON"));

        recyclerViewVertical.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
//
        RecyclerVerticalAdapter verticalAdapter = new RecyclerVerticalAdapter(this,listVerticals);
        recyclerViewVertical.setAdapter(verticalAdapter);
    }
}