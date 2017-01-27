package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class b7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b7);
    }
    public void onClickbo (View view) {
        ImageButton btn_animal = (ImageButton)findViewById(R.id.imageButton26);
        Intent intent = new Intent(b7Activity.this,b8Activity.class);
        startActivity(intent);
        finish();
    }
}
