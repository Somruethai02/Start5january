package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type2oAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type2o_animal);
    }
    public void onClickoee (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton105);
        Intent intent = new Intent(Type2oAnimal.this,Type2pAnimal.class);
        startActivity(intent);
        finish();
    }
}
