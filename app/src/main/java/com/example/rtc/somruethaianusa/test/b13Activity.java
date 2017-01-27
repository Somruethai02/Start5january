package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class b13Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b13);
    }
    public void onClickgo (View view) {
        ImageButton btn_animal32 = (ImageButton)findViewById(R.id.imageButton32);
        Intent intent = new Intent(b13Activity.this,b14Activity.class);
        startActivity(intent);
        finish();
    }
}
