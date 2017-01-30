package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type2iAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type2i_animal);
    }
    public void onClickoy (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton99);
        Intent intent = new Intent(Type2iAnimal.this,Type2jAnimal.class);
        startActivity(intent);
        finish();
    }
}
