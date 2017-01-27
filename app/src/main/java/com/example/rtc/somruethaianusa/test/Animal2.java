package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Animal2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal2);
    }   // Main Method

    public void clickNextAnimal2(View view) {
        startActivity(new Intent(Animal2.this, HubAnimal2.class));
    }

}   // Main Class
