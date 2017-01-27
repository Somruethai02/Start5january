package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class b9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b9);
    }
    public void onClickzo (View view) {
        ImageButton btn_animal26 = (ImageButton)findViewById(R.id.imageButton28);
        Intent intent = new Intent(b9Activity.this,b10Activity.class);
        startActivity(intent);
        finish();
    }
}
