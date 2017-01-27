package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class b6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b6);
    }
    public void onClickro (View view) {
        ImageButton btn_animal = (ImageButton)findViewById(R.id.imageButton25);
        Intent intent = new Intent(b6Activity.this,b7Activity.class);
        startActivity(intent);
        finish();
    }
}
