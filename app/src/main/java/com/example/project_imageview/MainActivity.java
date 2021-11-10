package com.example.project_imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private int fruitNo=0;
    ImageView image;
    Button button01;
    ArrayList<String> fruit= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    private ImageView secondImage;

    public void findview(View view) {
        secondImage = (ImageView) findViewById(R.id.imageView);
        secondImage.setImageResource(R.drawable.lcl);
    }
}