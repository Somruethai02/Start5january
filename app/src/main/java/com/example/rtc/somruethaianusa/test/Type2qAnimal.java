package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type2qAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type2q_animal);
    }
    public void onClickogg (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton107);
        Intent intent = new Intent(Type2qAnimal.this,TypeAnimal.class);
        startActivity(intent);
        finish();
    }
}
