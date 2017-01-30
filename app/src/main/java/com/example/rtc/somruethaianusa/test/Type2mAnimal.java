package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type2mAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type2m_animal);
    }
    public void onClickocc (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton103);
        Intent intent = new Intent(Type2mAnimal.this,Type2nAnimal.class);
        startActivity(intent);
        finish();
    }
}
