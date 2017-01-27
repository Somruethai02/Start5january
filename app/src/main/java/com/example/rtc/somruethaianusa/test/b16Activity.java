package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class b16Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b16);
    }
    public void onClickoo (View view) {
        ImageButton btn_animal36 = (ImageButton)findViewById(R.id.imageButton35);
        Intent intent = new Intent(b16Activity.this,b17Activity.class);
        startActivity(intent);
        finish();
    }
}
