package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class b3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b3);
    }
    public void onClickwo (View view) {
        ImageButton btn_animal = (ImageButton)findViewById(R.id.imageButton21);
        Intent intent = new Intent(b3Activity.this,b4Activity.class);
        startActivity(intent);
        finish();
    }
}
