package com.example.mryan.doudizhu;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.mryan.doudizhu.Utils.CreatImage;

public class MainActivity extends AppCompatActivity {

    Bitmap bitmap;
    ImageView imageView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.poke);
        imageView = findViewById(R.id.imageView1);
        imageView.setImageBitmap(new CreatImage(bitmap).endBitmap());
    }
}


