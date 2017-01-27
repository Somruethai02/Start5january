package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class a10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a10);
    }
    public void onClickp (View view) {
        ImageButton btn_animal10 = (ImageButton)findViewById(R.id.imageButton13);
        Intent intent = new Intent(a10Activity.this,a11Activity.class);
        startActivity(intent);
        finish();
    }
}
