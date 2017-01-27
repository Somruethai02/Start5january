package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class b12Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b12);
    }
    public void onClickfo (View view) {
        ImageButton btn_animal30 = (ImageButton)findViewById(R.id.imageButton31);
        Intent intent = new Intent(b12Activity.this,b13Activity.class);
        startActivity(intent);
        finish();
    }
}
