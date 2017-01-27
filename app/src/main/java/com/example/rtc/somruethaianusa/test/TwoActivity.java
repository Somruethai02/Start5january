package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }
    public void onClicktwo (View view) {
        ImageButton btn_animal = (ImageButton)findViewById(R.id.imageButton41);
        Intent intent = new Intent(TwoActivity.this,a1Activity.class);
        startActivity(intent);
    }
    public void onClickfour (View view) {
        ImageButton btn_animal = (ImageButton)findViewById(R.id.imageButton6);
        Intent intent = new Intent(TwoActivity.this,MainActivity.class);
        startActivity(intent);
    }
    public void onClickpop (View view) {
        ImageButton btn_animal = (ImageButton)findViewById(R.id.imageButton42);
        Intent intent = new Intent(TwoActivity.this,b1Activity.class);
        startActivity(intent);
    }
}
