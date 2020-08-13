package com.example.tulanmap;

import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.webkit.WebView;
import android.os.Bundle;

public class Mapa_3 extends AppCompatActivity {
    String url = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_3);

        WebView web = (WebView) findViewById(R.id.mapa_3);
        web.setWebViewClient (new MyWebViewClient());
        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        web.loadUrl (url);

    }

    private class MyWebViewClient extends WebViewClient
    {
        public boolean shouldOverrideUrlLoading ( WebView view,  String url){
            view.loadUrl(url);
            return true;
        }
    }
}