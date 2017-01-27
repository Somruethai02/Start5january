package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class a2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2);
    }
    public void onClicke (View view) {
        ImageButton btn_animal2 = (ImageButton)findViewById(R.id.imageButton5);
        Intent intent = new Intent(a2Activity.this,a3Activity.class);
        startActivity(intent);
        finish();
    }
}
