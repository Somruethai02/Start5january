package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type2gAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type2g_animal);
    }
    public void onClickow (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton97);
        Intent intent = new Intent(Type2gAnimal.this,Type2hAnimal.class);
        startActivity(intent);
        finish();
    }
}
