package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TypeAnimal extends AppCompatActivity implements View.OnClickListener {

    private Button type1Button, type2Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_animal);

        type1Button = (Button) findViewById(R.id.button6);
        type2Button = (Button) findViewById(R.id.button7);

        type1Button.setOnClickListener(this);
        type2Button.setOnClickListener(this);

    }   // Main Method

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button6:
                startActivity(new Intent(TypeAnimal.this, Type1Animal.class));
                break;
            case R.id.button7:
                startActivity(new Intent(TypeAnimal.this, Type2Animal.class));
                break;
        }

    }
}   // Main Class
