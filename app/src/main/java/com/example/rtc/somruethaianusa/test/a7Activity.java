package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class a7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a7);
    }
    public void onClickm (View view) {
        ImageButton btn_animal7 = (ImageButton)findViewById(R.id.imageButton10);
        Intent intent = new Intent(a7Activity.this,a8Activity.class);
        startActivity(intent);
        finish();
    }
}
