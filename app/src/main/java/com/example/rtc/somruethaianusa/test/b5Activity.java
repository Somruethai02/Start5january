package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class b5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b5);
    }
    public void onClickso (View view) {
        ImageButton btn_animal = (ImageButton)findViewById(R.id.imageButton24);
        Intent intent = new Intent(b5Activity.this,b6Activity.class);
        startActivity(intent);
        finish();
    }
}
