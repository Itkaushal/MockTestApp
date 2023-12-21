package com.kaushlendraprajapati.mocktest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.kaushlendraprajapati.mocktest.databinding.ActivitySplashScreenBinding;

public class SplashScreen extends AppCompatActivity {

    ActivitySplashScreenBinding splashScreenBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        splashScreenBinding=ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(splashScreenBinding.getRoot());

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent obj = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(obj);
                finish();
            }
        },5000);

        splashScreenBinding.btnstart.setOnClickListener(view ->{
            Intent i =new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
            finish();
        });
    }
}