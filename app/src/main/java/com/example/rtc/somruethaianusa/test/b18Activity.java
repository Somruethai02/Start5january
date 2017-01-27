package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class b18Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b18);
    }
    public void onClickvo(View view) {
        ImageButton btn_animal39 = (ImageButton)findViewById(R.id.imageButton37);
        Intent intent = new Intent(b18Activity.this,TwoActivity.class);
        startActivity(intent);
        finish();
    }
}
