package com.example.medionline;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screem);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent  intent= new Intent(SplashScreem.this, MainActivity.class);
                startActivity(intent);

            }
        }, 3000);
    }
}