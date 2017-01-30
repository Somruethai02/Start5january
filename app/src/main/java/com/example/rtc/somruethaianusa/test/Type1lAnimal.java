package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type1lAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type1l_animal);
    }
    public void onClickom (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton87);
        Intent intent = new Intent(Type1lAnimal.this,Type1mAnimal.class);
        startActivity(intent);
        finish();
    }
}
