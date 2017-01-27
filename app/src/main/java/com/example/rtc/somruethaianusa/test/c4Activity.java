package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class c4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c4);
    }
    public void onClickeoo (View view) {
        ImageButton btn_animal24 = (ImageButton)findViewById(R.id.imageButton50);
        Intent intent = new Intent(c4Activity.this,c5Activity.class);
        startActivity(intent);
        finish();
    }
}
