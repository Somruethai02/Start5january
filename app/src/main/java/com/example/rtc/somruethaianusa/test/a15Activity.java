package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class a15Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a15);
    }
    public void onClickz (View view) {
        ImageButton btn_animal15 = (ImageButton)findViewById(R.id.imageButton18);
        Intent intent = new Intent(a15Activity.this,TwoActivity.class);
        startActivity(intent);
        finish();
    }
}
