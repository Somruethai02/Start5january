package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class b15Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b15);
    }
    public void onClickpo (View view) {
        ImageButton btn_animal33 = (ImageButton)findViewById(R.id.imageButton34);
        Intent intent = new Intent(b15Activity.this,b16Activity.class);
        startActivity(intent);
        finish();
    }
}
