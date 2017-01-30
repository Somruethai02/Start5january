package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type1Animal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type1_animal);
    }
    public void onClickoa (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton75);
        Intent intent = new Intent(Type1Animal.this,Type1aAnimal.class);
        startActivity(intent);
            finish();
    }
}
