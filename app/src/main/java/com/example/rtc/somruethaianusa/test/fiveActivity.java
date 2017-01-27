package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class fiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

    }
    public void onClickaoo (View view) {
        ImageButton btn_animal24 = (ImageButton) findViewById(R.id.imageButton45);
        Intent intent = new Intent(fiveActivity.this, c1Activity.class);
        startActivity(intent);
    }
    public void onClickjoo (View view) {
        ImageButton btn_animal24 = (ImageButton)findViewById(R.id.imageButton46);
        Intent intent = new Intent(fiveActivity.this,c16Activity.class);
        startActivity(intent);
    }

}
