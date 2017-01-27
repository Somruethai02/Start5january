package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class a12Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a12);
    }
    public void onClickr (View view) {
        ImageButton btn_animal12 = (ImageButton)findViewById(R.id.imageButton15);
        Intent intent = new Intent(a12Activity.this,a13Activity.class);
        startActivity(intent);
        finish();
    }
}
