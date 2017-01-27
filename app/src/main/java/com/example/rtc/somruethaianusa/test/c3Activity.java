package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class c3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c3);
    }
    public void onClickdoo (View view) {
        ImageButton btn_animal24 = (ImageButton)findViewById(R.id.imageButton51);
        Intent intent = new Intent(c3Activity.this,c4Activity.class);
        startActivity(intent);
        finish();
    }
}
