package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type2lAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type2l_animal);
    }
    public void onClickobb (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton102);
        Intent intent = new Intent(Type2lAnimal.this,Type2mAnimal.class);
        startActivity(intent);
        finish();
    }
}
