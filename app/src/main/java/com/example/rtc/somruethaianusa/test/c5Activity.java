package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class c5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c5);
    }
    public void onClickfoo (View view) {
        ImageButton btn_animal24 = (ImageButton)findViewById(R.id.imageButton52);
        Intent intent = new Intent(c5Activity.this,c6Activity.class);
        startActivity(intent);
        finish();
    }
}
