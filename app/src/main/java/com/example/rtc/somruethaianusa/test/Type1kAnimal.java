package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type1kAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type1k_animal);
    }
    public void onClickol (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton86);
        Intent intent = new Intent(Type1kAnimal.this,Type1lAnimal.class);
        startActivity(intent);
        finish();
    }
}
