package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type2eAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type2e_animal);
    }
    public void onClickou (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton95);
        Intent intent = new Intent(Type2eAnimal.this,Type2fAnimal.class);
        startActivity(intent);
        finish();
    }
}
