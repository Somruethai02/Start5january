package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class a1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);
    }
    public void onClicktree (View view) {
        ImageButton btn_animal = (ImageButton)findViewById(R.id.imageButton1);
        Intent intent = new Intent(a1Activity.this,a2Activity.class);
        startActivity(intent);
            finish();
    }
}
