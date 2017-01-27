package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class a9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a9);
    }
    public void onClicko (View view) {
        ImageButton btn_animal9 = (ImageButton)findViewById(R.id.imageButton12);
        Intent intent = new Intent(a9Activity.this,a10Activity.class);
        startActivity(intent);
        finish();
    }
}
