package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class b10Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b10);
    }
    public void onClickco (View view) {
        ImageButton btn_animal27 = (ImageButton)findViewById(R.id.imageButton29);
        Intent intent = new Intent(b10Activity.this,b11Activity.class);
        startActivity(intent);
        finish();
    }
}
