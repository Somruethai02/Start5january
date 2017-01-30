package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type2pAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type2p_animal);
    }
    public void onClickoff (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton106);
        Intent intent = new Intent(Type2pAnimal.this,Type2qAnimal.class);
        startActivity(intent);
        finish();
    }
}
