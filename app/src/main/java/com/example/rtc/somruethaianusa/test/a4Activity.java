package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class a4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a4);
    }
    public void onClickt (View view) {
        ImageButton btn_animal4 = (ImageButton)findViewById(R.id.imageButton7);
        Intent intent = new Intent(a4Activity.this,a5Activity.class);
        startActivity(intent);
        finish();
    }
}
