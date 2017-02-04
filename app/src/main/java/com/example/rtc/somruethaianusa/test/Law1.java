package com.example.rtc.somruethaianusa.test;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Law1 extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law1);

        textView = (TextView) findViewById(R.id.textViewa);
        textView = (TextView) findViewById(R.id.textViewb);

        //Button Controller
       textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Show WebView
                String url = "http://www.dnp.go.th/wildlifednp/%E0%B9%80%E0%B8%AD%E0%B8%81%E0%B8%AA%E0%B8%B2%E0%B8%A3/gov4.pdf";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);

                //Show WebView
                String url1 = "http://www.dnp.go.th/wildlifednp/%E0%B9%80%E0%B8%AD%E0%B8%81%E0%B8%AA%E0%B8%B2%E0%B8%A3/gov2.pdf";
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse(url1));
                startActivity(intent1);


            }   // onClick
        });



    }
}
