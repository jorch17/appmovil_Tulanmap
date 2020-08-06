package com.example.tulanmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class ampliacionSonora extends AppCompatActivity {


    Button home;

    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        return true;
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliacion_sonora);

      /*  WebView webView = (WebView) this.findViewById(R.id.web_view2);
        //webView.loadUrl("https://www.google.com/maps/d/viewer?mid=1VsoidXJHYH6avHHqGJ-30vniKKBFMOTf");
        webView.loadUrl("https://animeflv.net/");
        webView.setWebViewClient(new WebViewClient());

*/
        home = (Button)findViewById(R.id.button_home);
        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent ir_home = new Intent(ampliacionSonora.this, MainActivity.class);
                startActivity(ir_home);

            }
        });

    }
}
