package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type1gAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type1g_animal);
    }
    public void onClickoh (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton82);
        Intent intent = new Intent(Type1gAnimal.this,Type1hAnimal.class);
        startActivity(intent);
        finish();
    }
}
