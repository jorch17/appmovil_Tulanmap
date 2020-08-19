package com.example.tulanmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class Ruta_5 extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruta_5);

        btn = findViewById(R.id.home_5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Ruta_5.this, MainActivity.class);
                startActivity(a);
            }
        });

        btn = findViewById(R.id.paradas_5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Ruta_5.this, Paradas_5.class);
                startActivity(a);
            }
        });

        btn = findViewById(R.id.tarifas_5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Ruta_5.this, Tarifas_5.class);
                startActivity(a);
            }
        });
    }
}