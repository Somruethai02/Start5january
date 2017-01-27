package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class c1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1);
    }
    public void onClickboo (View view) {
        ImageButton btn_animal24 = (ImageButton)findViewById(R.id.imageButton48);
        Intent intent = new Intent(c1Activity.this,c2Activity.class);
        startActivity(intent);
        finish();
    }
}
