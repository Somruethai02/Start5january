package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type1bAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type1b_animal);
    }
    public void onClickoc (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton77);
        Intent intent = new Intent(Type1bAnimal.this,Type1cAnimal.class);
        startActivity(intent);
        finish();
    }
}
