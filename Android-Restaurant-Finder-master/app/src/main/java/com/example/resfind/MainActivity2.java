package com.example.resfind;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends AppCompatActivity {
 WebView vjk;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        vjk=(WebView) findViewById(R.id.web2);
        vjk.setVerticalScrollBarEnabled(true);
        vjk.setWebViewClient(new mybuz());
        vjk.getSettings().setJavaScriptEnabled(true);
        vjk.loadUrl("http://knightslord.pythonanywhere.com/");
    }

    private class mybuz extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

    }
}