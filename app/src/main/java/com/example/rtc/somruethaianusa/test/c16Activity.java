package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class c16Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c16);
    }
    public void onClickxoo (View view) {
        ImageButton btn_animal24 = (ImageButton)findViewById(R.id.imageButton57);
        Intent intent = new Intent(c16Activity.this,c17Activity.class);
        startActivity(intent);
    }
}
