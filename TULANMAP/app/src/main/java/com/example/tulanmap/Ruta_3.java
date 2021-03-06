package com.example.tulanmap;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ruta_3 extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruta_3);
        btn = findViewById(R.id.home_3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Ruta_3.this, MainActivity.class);
                startActivity(a);
            }
        });
        btn = findViewById(R.id.paradas_3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Ruta_3.this, Paradas_3.class);
                startActivity(a);
            }
        });
        btn = findViewById(R.id.tarifas_3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Ruta_3.this, Tarifas_3.class);
                startActivity(a);
            }
        });
    }
}