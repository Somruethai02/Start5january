package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class c2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2);
    }
    public void onClickcoo (View view) {
        ImageButton btn_animal24 = (ImageButton)findViewById(R.id.imageButton49);
        Intent intent = new Intent(c2Activity.this,c3Activity.class);
        startActivity(intent);
        finish();
    }
}
