package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type2dAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type2d_animal);
    }
    public void onClickot (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton94);
        Intent intent = new Intent(Type2dAnimal.this,Type2eAnimal.class);
        startActivity(intent);
        finish();
    }
}
