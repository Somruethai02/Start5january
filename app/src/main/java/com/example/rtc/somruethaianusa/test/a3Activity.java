package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class a3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a3);
    }
    public void onClickw (View view) {
        ImageButton btn_animal3 = (ImageButton)findViewById(R.id.imageButton);
        Intent intent = new Intent(a3Activity.this,a4Activity.class);
        startActivity(intent);
        finish();
    }
}
