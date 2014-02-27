package com.mgdllc.linx.linx;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class linx_WebViewClient extends Activity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        String urls = "";
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            urls = extras.getString("URL");
        }

        mWebView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl(urls);

    }

    @Override
    // Detect when the back button is pressed
    public void onBackPressed() {
        if(mWebView.canGoBack()) {
            mWebView.goBack();
        } else {
            // Let the system handle the back button
            super.onBackPressed();
        }
    }

}
