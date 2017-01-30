package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type1aAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type1a_animal);
    }
    public void onClickob (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton76);
        Intent intent = new Intent(Type1aAnimal.this,Type1bAnimal.class);
        startActivity(intent);
        finish();
    }
}
