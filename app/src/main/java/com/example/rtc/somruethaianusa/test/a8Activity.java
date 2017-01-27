package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class a8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a8);
    }
    public void onClickn (View view) {
        ImageButton btn_animal8 = (ImageButton)findViewById(R.id.imageButton11);
        Intent intent = new Intent(a8Activity.this,a9Activity.class);
        startActivity(intent);
        finish();

    }
}
