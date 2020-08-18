package com.example.tulanmap;

import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.webkit.WebView;
import android.os.Bundle;

public class Mapa_3 extends AppCompatActivity {
    String url = "https://www.google.com/maps/d/viewer?mid=1-51zbNcIb0HgTdgmzDjfW1lJ5XToY3hL&ll=20.05662685367453%2C-98.33830897672169&z=13";
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