package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class b11Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b11);
    }
    public void onClickdo (View view) {
        ImageButton btn_animal28 = (ImageButton)findViewById(R.id.imageButton30);
        Intent intent = new Intent(b11Activity.this,b12Activity.class);
        startActivity(intent);
        finish();
    }
}
