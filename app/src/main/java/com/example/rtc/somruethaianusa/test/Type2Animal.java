package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type2Animal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type2_animal);
    }
    public void onClickop (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton90);
        Intent intent = new Intent(Type2Animal.this,Type2aAnimal.class);
        startActivity(intent);
        finish();
    }
}
