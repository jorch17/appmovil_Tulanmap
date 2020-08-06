package com.example.tulanmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class lavillita extends AppCompatActivity {

    Button home;

    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        return true;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lavillita);

        /*
        WebView webView = (WebView) this.findViewById(R.id.web_view3);
        //webView.loadUrl("https://goo.gl/maps/56AE7F1JdZgGbRZA9");
        webView.loadUrl("https://maps.google.com/");
        webView.setWebViewClient(new WebViewClient());
*/
        home = (Button)findViewById(R.id.button_home);

        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent ir_home = new Intent(lavillita.this, MainActivity.class);
                startActivity(ir_home);

            }
        });
    }
}
