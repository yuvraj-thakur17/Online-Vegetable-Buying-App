package com.example.vegetableapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    private RecyclerView.Adapter adapter;
//    private RecyclerView recyclerViewCategoryList;

    //test
    ImageView profilepic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        recyclerViewCategory();

        //test
        profilepic=findViewById(R.id.profile_pic);
        Intent intent=new Intent(MainActivity.this,ProjectDetailsActivity.class);
        startActivity(intent);

    }

//    private void recyclerViewCategory(){
//        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//        recyclerViewCategoryList.findViewById(R.id.categories_recyclerView);
//        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);
//
//        ArrayList<CategoryDomain> category= new ArrayList<>();
//        category.add(new CategoryDomain("Home Supplies","home_supplies"));
//        category.add(new CategoryDomain("Beverages","beverages"));
//        category.add(new CategoryDomain("Grocery","grocery"));
//        category.add(new CategoryDomain("Instant Foods","instant_foods"));
//    }
}