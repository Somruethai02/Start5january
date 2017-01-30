package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type1dAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type1d_animal);
    }
    public void onClickoe (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton79);
        Intent intent = new Intent(Type1dAnimal.this,Type1eAnimal.class);
        startActivity(intent);
        finish();
    }
}
