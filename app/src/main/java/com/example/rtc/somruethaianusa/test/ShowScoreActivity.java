package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class ShowScoreActivity extends AppCompatActivity {

    private TextView txtShowScore;
    private int intMyScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_score);

        txtShowScore = (TextView) findViewById(R.id.txtShowScore);

        //Get Value From QuestionActivity
        intMyScore = getIntent().getExtras().getInt("Score");

        txtShowScore.setText(Integer.toString(intMyScore) + "/50" );


    }   // onCreate


    public void clickPlay(View view) {

        Intent objIntent = new Intent(ShowScoreActivity.this, QuestionActivity.class);
        startActivity(objIntent);

    }

    public void clickExit(View view) {

        finish();

    }




} // Main Class
