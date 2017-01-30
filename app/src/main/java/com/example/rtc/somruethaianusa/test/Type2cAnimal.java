package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type2cAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type2c_animal);
    }
    public void onClickos (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton93);
        Intent intent = new Intent(Type2cAnimal.this,Type2dAnimal.class);
        startActivity(intent);
        finish();
    }
}
