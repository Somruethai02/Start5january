package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class b4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b4);
    }
    public void onClickto (View view) {
        ImageButton btn_animal = (ImageButton)findViewById(R.id.imageButton22);
        Intent intent = new Intent(b4Activity.this,b5Activity.class);
        startActivity(intent);
        finish();
    }
}
