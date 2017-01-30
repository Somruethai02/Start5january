package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type2jAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type2j_animal);
    }
    public void onClickoz (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton100);
        Intent intent = new Intent(Type2jAnimal.this,Type2kAnimal.class);
        startActivity(intent);
        finish();
    }
}
