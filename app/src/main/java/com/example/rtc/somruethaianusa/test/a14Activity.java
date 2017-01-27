package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class a14Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a14);
    }
    public void onClickv (View view) {
        ImageButton btn_animal14 = (ImageButton)findViewById(R.id.imageButton17);
        Intent intent = new Intent(a14Activity.this,a15Activity.class);
        startActivity(intent);
        finish();
    }
}
