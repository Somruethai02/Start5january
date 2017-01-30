package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type1mAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type1m_animal);
    }
    public void onClickon (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton88);
        Intent intent = new Intent(Type1mAnimal.this,Type1nAnimal.class);
        startActivity(intent);
        finish();
    }
}
