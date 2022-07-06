package com.example.quotez.HelperClass;

public class CategoryModel {
    int moodImg;
    String moodName;

    public CategoryModel(int moodImg, String moodName){
        this.moodImg=moodImg;
        this.moodName=moodName;
    }

    public int getMoodImg() {
        return moodImg;
    }

    public String getMoodName() {
        return moodName;
    }
}

