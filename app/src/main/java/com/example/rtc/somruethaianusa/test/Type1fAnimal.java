package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type1fAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type1f_animal);
    }
    public void onClickog (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton81);
        Intent intent = new Intent(Type1fAnimal.this,Type1gAnimal.class);
        startActivity(intent);
        finish();
    }
}
