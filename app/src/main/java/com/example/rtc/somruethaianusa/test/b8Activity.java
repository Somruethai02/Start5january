package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class b8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b8);
    }
    public void onClickyo (View view) {
        ImageButton btn_animal24 = (ImageButton)findViewById(R.id.imageButton27);
        Intent intent = new Intent(b8Activity.this,b9Activity.class);
        startActivity(intent);
        finish();
    }
}
