package com.example.tester;

import android.graphics.Bitmap;

public class Food {
    public String foodname;
    public String discrip;
    public Bitmap image;

    Food(String foodname,String discrip,Bitmap image){
        this.foodname=foodname;
        this.discrip=discrip;
        this.image=image;
    }
}
