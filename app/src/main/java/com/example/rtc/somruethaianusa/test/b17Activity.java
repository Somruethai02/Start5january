package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class b17Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b17);
    }
    public void onClickgo (View view) {
        ImageButton btn_animal37 = (ImageButton)findViewById(R.id.imageButton36);
        Intent intent = new Intent(b17Activity.this,b18Activity.class);
        startActivity(intent);
        finish();
    }
}
