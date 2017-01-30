package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type2hAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type2h_animal);
    }
    public void onClickox (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton98);
        Intent intent = new Intent(Type2hAnimal.this,Type2iAnimal.class);
        startActivity(intent);
        finish();
    }
}
