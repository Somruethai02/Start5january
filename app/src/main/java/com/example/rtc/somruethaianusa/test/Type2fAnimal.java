package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Type2fAnimal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type2f_animal);}
    public void onClickov (View view) {
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton96);
        Intent intent = new Intent(Type2fAnimal.this,Type2gAnimal.class);
        startActivity(intent);
        finish();

    }
}
