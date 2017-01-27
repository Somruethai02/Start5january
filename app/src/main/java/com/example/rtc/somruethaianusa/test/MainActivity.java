package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }   // Main Method

    public void clickQuestionMain(View view) {
        startActivity(new Intent(MainActivity.this, QuestionActivity.class));
    }

    public void clickNewPlayGame(View view) {
        startActivity(new Intent(MainActivity.this, PlayGame1.class));
    }

    public void clickKnowleage(View view) {
        startActivity(new Intent(MainActivity.this, KnowleageActivity.class));
    }

    public void onClickone (View view) {
        ImageButton btn_next = (ImageButton)findViewById(R.id.imageButton1);
        Intent intent = new Intent(MainActivity.this,TwoActivity.class);
        startActivity(intent);



    }   // onClickone
}   // Main Class
