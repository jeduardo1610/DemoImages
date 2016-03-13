package com.example.m14x.demoimages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView) findViewById(R.id.imageView);
    }


    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnChangeImage:
                image.setImageResource(R.drawable.mario2);
                break;
        }

    }
}
