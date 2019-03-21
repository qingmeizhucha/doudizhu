package com.example.mryan.doudizhu.Utils;

import android.graphics.Bitmap;

public class CreatImage {
    Bitmap bitmap;
    public CreatImage(Bitmap bitmap){
        this.bitmap = bitmap;
    }
    public Bitmap endBitmap(){
        return Bitmap.createBitmap(bitmap,0,0,bitmap.getWidth()/14/5,bitmap.getHeight()/4);
    }
}
