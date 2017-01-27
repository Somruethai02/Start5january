package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class c6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c6);
    }
    public void onClickgoo (View view) {
        ImageButton btn_animal24 = (ImageButton)findViewById(R.id.imageButton53);
        Intent intent = new Intent(c6Activity.this,c7Activity.class);
        startActivity(intent);
        finish();
    }
}
