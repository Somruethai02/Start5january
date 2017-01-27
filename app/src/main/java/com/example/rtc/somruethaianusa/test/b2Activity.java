package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class b2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b2);
    }
    public void onClickno (View view) {
        ImageButton btn_animal = (ImageButton)findViewById(R.id.imageButton23);
        Intent intent = new Intent(b2Activity.this,b3Activity.class);
        startActivity(intent);
        finish();
    }
}
