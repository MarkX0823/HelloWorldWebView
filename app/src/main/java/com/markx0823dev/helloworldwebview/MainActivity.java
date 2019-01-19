package com.markx0823dev.helloworldwebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView mainWebView = findViewById(R.id.main_web_view);

        mainWebView.setWebChromeClient(new WebChromeClient());
        mainWebView.setWebViewClient(new WebViewClient());

        mainWebView.loadUrl("https://www.google.com/");

        Toast.makeText(this,
                "Version Code is " + BuildConfig.VERSION_CODE,
                Toast.LENGTH_LONG)
                .show();
    }
}
