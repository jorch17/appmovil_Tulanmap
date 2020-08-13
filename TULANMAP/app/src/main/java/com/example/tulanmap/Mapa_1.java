package com.example.tulanmap;

import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.webkit.WebView;
import android.os.Bundle;

public class Mapa_1 extends AppCompatActivity {
    String url = "https://www.google.com/maps/d/viewer?mid=1qaqne8IDKY9Ofjab_AjRTcY-J_v8PskE&ll=20.0737908437065%2C-98.39088500000001&z=14";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_1);
        WebView web = (WebView) findViewById(R.id.mapa_1);
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