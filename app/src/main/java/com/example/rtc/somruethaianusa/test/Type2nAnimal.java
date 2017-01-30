package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type2nAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type2n_animal);
    }
    public void onClickodd (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton104);
        Intent intent = new Intent(Type2nAnimal.this,Type2oAnimal.class);
        startActivity(intent);
        finish();
    }
}
