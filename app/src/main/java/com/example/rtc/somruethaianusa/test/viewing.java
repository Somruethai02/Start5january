package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class viewing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewing);
    }   // onCreate


    public void clickPlay(View view) {

        Intent objIntent = new Intent(viewing.this, PlayGame1.class);
        startActivity(objIntent);
    }

    public void clickExit(View view) {
        Intent objIntent = new Intent(viewing.this, MainActivity.class);
        startActivity(objIntent);

    }
}
