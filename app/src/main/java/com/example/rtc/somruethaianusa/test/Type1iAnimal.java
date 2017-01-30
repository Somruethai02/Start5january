package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type1iAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type1i_animal);
    }
    public void onClickoj (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton84);
        Intent intent = new Intent(Type1iAnimal.this,Type1jAnimal.class);
        startActivity(intent);
        finish();
    }
}
