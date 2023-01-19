package com.example.rku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class RkuWebView extends AppCompatActivity {

    WebView rkweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rku_web_view);

        WebView rkweb = (WebView) findViewById(R.id.rkweb);
        rkweb.loadUrl("https://rku.ac.in/");

    }
}