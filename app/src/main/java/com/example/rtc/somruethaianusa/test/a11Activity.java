package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class a11Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a11);
    }
    public void onClickq (View view) {
        ImageButton btn_animal11 = (ImageButton)findViewById(R.id.imageButton14);
        Intent intent = new Intent(a11Activity.this,a12Activity.class);
        startActivity(intent);
        finish();
    }

}
