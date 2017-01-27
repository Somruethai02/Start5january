package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class a13Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a13);
    }
    public void onClicks (View view) {
        ImageButton btn_animal13 = (ImageButton)findViewById(R.id.imageButton16);
        Intent intent = new Intent(a13Activity.this,a14Activity.class);
        startActivity(intent);
        finish();
    }
}
