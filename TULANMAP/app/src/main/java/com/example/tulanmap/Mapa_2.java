package com.example.tulanmap;

import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.webkit.WebView;
import android.os.Bundle;

public class Mapa_2 extends AppCompatActivity {
    String url = "https://www.google.com/maps/d/u/3/viewer?mid=1_9R9Y6BiT0K5gbrsqgwA1WKjwcxHQuKj&ll=20.077785614063846%2C-98.399135&z=14";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_2);

        WebView web = (WebView) findViewById(R.id.mapa_2);
        web.setWebViewClient (new Mapa_2.MyWebViewClient());
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
