package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type1eAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type1e_animal);
    }
    public void onClickof (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton80);
        Intent intent = new Intent(Type1eAnimal.this,Type1fAnimal.class);
        startActivity(intent);
        finish();
    }
}
