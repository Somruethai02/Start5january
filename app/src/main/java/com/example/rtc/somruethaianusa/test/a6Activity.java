package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class a6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a6);
    }
    public void onClickf (View view) {
        ImageButton btn_animal6 = (ImageButton)findViewById(R.id.imageButton9);
        Intent intent = new Intent(a6Activity.this,a7Activity.class);
        startActivity(intent);
        finish();
    }
}
