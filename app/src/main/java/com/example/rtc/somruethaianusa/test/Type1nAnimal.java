package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type1nAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type1n_animal);
    }
    public void onClickoo (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton89);
        Intent intent = new Intent(Type1nAnimal.this,TypeAnimal.class);
        startActivity(intent);
        finish();
    }
}
