package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type2bAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type2b_animal);
    }
    public void onClickor (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton92);
        Intent intent = new Intent(Type2bAnimal.this,Type2cAnimal.class);
        startActivity(intent);
        finish();
    }
}
