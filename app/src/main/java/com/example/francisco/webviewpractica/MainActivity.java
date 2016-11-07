package com.example.francisco.webviewpractica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView myWebView = (WebView) this.findViewById(R.id.webView);
        myWebView.loadUrl("https://www.android.com/intl/es-419_mx/");
    }
}
