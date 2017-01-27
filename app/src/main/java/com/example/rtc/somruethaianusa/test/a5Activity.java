package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class a5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a5);
    }
    public void onClickc (View view) {
        ImageButton btn_animal5 = (ImageButton)findViewById(R.id.imageButton8);
        Intent intent = new Intent(a5Activity.this,a6Activity.class);
        startActivity(intent);
        finish();
    }
}
