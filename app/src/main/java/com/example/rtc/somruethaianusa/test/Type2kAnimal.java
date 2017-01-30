package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type2kAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type2k_animal);
    }
    public void onClickoaa (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton101);
        Intent intent = new Intent(Type2kAnimal.this,Type2lAnimal.class);
        startActivity(intent);
        finish();
    }
}
