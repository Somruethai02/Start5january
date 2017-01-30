package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HubAnimal2 extends AppCompatActivity implements View.OnClickListener {

    private Button law1Button, law2Button, typeAnimalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hub_animal2);

        //Bind Widget
        law1Button = (Button) findViewById(R.id.button3);
        law2Button = (Button) findViewById(R.id.button4);
        typeAnimalButton = (Button) findViewById(R.id.button5);


        law1Button.setOnClickListener(this);
        law2Button.setOnClickListener(this);
        typeAnimalButton.setOnClickListener(this);



    }   // Main Method

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button3:
                startActivity(new Intent(HubAnimal2.this, Law1.class));
                break;
            case R.id.button4:
                startActivity(new Intent(HubAnimal2.this, Law2.class));
                break;
            case R.id.button5:
                startActivity(new Intent(HubAnimal2.this, TypeAnimal.class));
                break;


        }

    }   // onClick
}   // Main Class
