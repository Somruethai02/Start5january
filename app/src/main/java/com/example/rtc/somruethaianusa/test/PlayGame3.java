package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayGame3 extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView1, imageView2, imageView3;
    private int timeAnInt = 0;
    private TextView textView;
    private boolean aBoolean = true;
    private int time = 60;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game3);

        imageView1 = (ImageView) findViewById(R.id.g);
        imageView2 = (ImageView) findViewById(R.id.h);
        imageView3 = (ImageView) findViewById(R.id.i);
        textView = (TextView) findViewById(R.id.textView20);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        myLoop();


    }   // Main Method

    private void myLoop() {

        if (aBoolean) {

            if (time == 0) {
                aBoolean = false;
                startActivity(new Intent(new Intent(PlayGame3.this, Gameover.class)));
                finish();
            }

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    time -= 1;
                    textView.setText(Integer.toString(time) +  " Sec");
                    myLoop();
                }
            }, 1000);
        }

    }   // loop

    @Override
    public void onClick(View view) {

        Log.d("16janV3", "click OK");

        switch (view.getId()) {
            case R.id.g:
                clickImage(imageView1);
                break;
            case R.id.h:
                clickImage(imageView2);
                break;
            case R.id.i:
                clickImage(imageView3);
                break;

        }


    }   // onClick

    private void clickImage(ImageView imageView) {
        imageView.setImageResource(R.drawable.boo);
        timeAnInt += 1;
        if (timeAnInt == 3) {
            startActivity(new Intent(PlayGame3.this, PlayGame4.class));
        }
    }
}   // Main Class
