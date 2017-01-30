package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type2aAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type2a_animal);
    }
    public void onClickoq (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton91);
        Intent intent = new Intent(Type2aAnimal.this,Type2bAnimal.class);
        startActivity(intent);
        finish();
    }
}
