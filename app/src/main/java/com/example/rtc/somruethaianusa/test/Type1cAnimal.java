package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type1cAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type1c_animal);
    }
    public void onClickod (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton78);
        Intent intent = new Intent(Type1cAnimal.this,Type1dAnimal.class);
        startActivity(intent);
        finish();
    }
}
