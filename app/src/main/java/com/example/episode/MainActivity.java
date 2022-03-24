package com.example.episode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView k;
    Animation dora;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent( getApplicationContext(), second.class );
                startActivity(intent);
            }
        },3000);
        k=findViewById(R.id.imageView2);
        dora= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        k.startAnimation(dora);
    }
}