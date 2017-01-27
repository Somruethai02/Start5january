package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KnowleageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowleage);
    }   // Main Method

    public void clickAnimal1(View view) {
        startActivity(new Intent(KnowleageActivity.this, Animal1.class));
    }

    public void clickAnimal2(View view) {
        startActivity(new Intent(KnowleageActivity.this, Animal2.class));
    }

}   // Main Class
