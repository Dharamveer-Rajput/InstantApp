package com.mytaxiride.instantapp.feature;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    private ImageView imageGoogle,imageYahoo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final WebView mywebview = (WebView) findViewById(R.id.webView1);
        imageGoogle = findViewById(R.id.imageGoogle);
        imageYahoo = findViewById(R.id.imageYahoo);


        mywebview.getSettings().setJavaScriptEnabled(true);
        mywebview.setWebViewClient(new WebViewClient());
        mywebview.loadUrl("https://www.google.com");


        imageGoogle.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                mywebview.loadUrl("https://mail.google.com");


            }
        });

        imageYahoo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                mywebview.loadUrl("https://www.yahoo.com");


            }
        });


        // ATTENTION: This was auto-generated to handle app links.
        Intent appLinkIntent = getIntent();
        String appLinkAction = appLinkIntent.getAction();
        Uri appLinkData = appLinkIntent.getData();
    }


}