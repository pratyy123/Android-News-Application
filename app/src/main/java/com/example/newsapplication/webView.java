package com.example.newsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;



public class webView extends AppCompatActivity {

    android.widget.Toolbar toolbar;
    WebView webView;
    private Object Toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view3);
        toolbar=findViewById(R.id.Toolbar);
        webView=findViewById(R.id.webview);
        setSupportActionBar(toolbar);
        Intent intent=getIntent();
        String url=intent.getStringExtra("url");
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }

    private void setSupportActionBar(android.widget.Toolbar toolbar) {
    }
}