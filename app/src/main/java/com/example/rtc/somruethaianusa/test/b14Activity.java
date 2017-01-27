package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class b14Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b14);
    }
    public void onClicklo (View view) {
        ImageButton btn_animal16 = (ImageButton)findViewById(R.id.imageButton33);
        Intent intent = new Intent(b14Activity.this,b15Activity.class);
        startActivity(intent);
        finish();
    }
}
