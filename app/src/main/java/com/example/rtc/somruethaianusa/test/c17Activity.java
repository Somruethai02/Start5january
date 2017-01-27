package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class c17Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c17);
    }
    public void onClickmoo (View view) {
        ImageButton btn_animal24 = (ImageButton)findViewById(R.id.imageButton58);
        Intent intent = new Intent(c17Activity.this,fiveActivity.class);
        startActivity(intent);
    }
}
