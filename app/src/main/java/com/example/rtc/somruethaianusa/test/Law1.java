package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Law1 extends AppCompatActivity implements View.OnClickListener {
    private TextView textViewa, textViewb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law1);

        textViewa = (TextView) findViewById(R.id.textViewa);
        textViewb = (TextView) findViewById(R.id.textViewb);

        //Button Controller
        textViewa.setOnClickListener(this);
        textViewb.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.textViewa:

                //Show WebView
                String url = "http://androidthai.in.th/about-me.html";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

                break;
            case R.id.textViewb:

                //Show WebView
                String url1 = "http://www.dnp.go.th/wildlifednp/%E0%B9%80%E0%B8%AD%E0%B8%81%E0%B8%AA%E0%B8%B2%E0%B8%A3/gov2.pdf";
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse(url1));
                startActivity(intent1);

                break;
        }
    }
}
