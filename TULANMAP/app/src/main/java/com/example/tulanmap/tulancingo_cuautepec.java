package com.example.tulanmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;



public class tulancingo_cuautepec extends AppCompatActivity {



    Button home;



        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return true;

        }
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_tulancingo_cuautepec);

/*


            WebView webView = (WebView) this.findViewById(R.id.web_view);
            //webView.loadUrl("https://www.google.com/maps/d/edit?mid=1-51zbNcIb0HgTdgmzDjfW1lJ5XToY3hL&ll");
            webView.loadUrl("https://www.google.com/maps/d/viewer?mid=1qaqne8IDKY9OfjabAjRTcY-Jv8PskE");
            webView.setWebViewClient(new WebViewClient());

*/

            home = (Button)findViewById(R.id.button_home);
            home.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    Intent ir_home = new Intent(tulancingo_cuautepec.this, MainActivity.class);
                    startActivity(ir_home);

                }
            });





        }



    }

