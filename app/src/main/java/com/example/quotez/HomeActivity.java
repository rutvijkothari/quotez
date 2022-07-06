package com.example.quotez;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quotez.HelperClass.CategoryAdapter;
import com.example.quotez.HelperClass.CategoryClickInterface;
import com.example.quotez.HelperClass.CategoryModel;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    RecyclerView rcvCategory;
    GridLayoutManager gridLayoutManager;
    LinearLayoutManager layoutManager;
    List<CategoryModel> moodList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initData();
        initRcv();
    }

    private void initData() {

        moodList = new ArrayList<>();

        moodList.add(new CategoryModel(R.drawable.love_bg, "Love"));
        moodList.add(new CategoryModel(R.drawable.happy_bg, "Happy"));
        moodList.add(new CategoryModel(R.drawable.magic_bg, "Magic"));
        moodList.add(new CategoryModel(R.drawable.love_bg, "Love"));
        moodList.add(new CategoryModel(R.drawable.love_bg, "Love"));
        moodList.add(new CategoryModel(R.drawable.love_bg, "Love"));
        moodList.add(new CategoryModel(R.drawable.love_bg, "Love"));
        moodList.add(new CategoryModel(R.drawable.love_bg, "Love"));
        moodList.add(new CategoryModel(R.drawable.love_bg, "Love"));
        moodList.add(new CategoryModel(R.drawable.love_bg, "Love"));
        moodList.add(new CategoryModel(R.drawable.love_bg, "Love"));
        moodList.add(new CategoryModel(R.drawable.love_bg, "Love"));
        moodList.add(new CategoryModel(R.drawable.love_bg, "Love"));
        moodList.add(new CategoryModel(R.drawable.love_bg, "Love"));
        moodList.add(new CategoryModel(R.drawable.love_bg, "Love"));
        moodList.add(new CategoryModel(R.drawable.love_bg, "Love"));
        moodList.add(new CategoryModel(R.drawable.love_bg, "Love"));
        moodList.add(new CategoryModel(R.drawable.love_bg, "Love"));


    }

    private void initRcv() {

        CategoryClickInterface categoryClickInterface = () -> {
//        Log.e("TAG", "categoryClick: ",+text);
        };

        rcvCategory = findViewById(R.id.rcvCategory);
//        layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(RecyclerView.VERTICAL);

        gridLayoutManager = new GridLayoutManager(this,1);
        rcvCategory.setLayoutManager(gridLayoutManager);

        CategoryAdapter categoryAdapter = new CategoryAdapter(moodList);
        rcvCategory.setAdapter(categoryAdapter);
    }
}