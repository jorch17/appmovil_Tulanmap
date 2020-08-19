package com.example.tulanmap;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class Ruta_4 extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruta_4);

        btn = findViewById(R.id.home_4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Ruta_4.this, MainActivity.class);
                startActivity(a);
            }
        });

        btn = findViewById(R.id.paradas_4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Ruta_4.this, Paradas_4.class);
                startActivity(a);
            }
        });

        btn = findViewById(R.id.tarifas_4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Ruta_4.this, Tarifas_4.class);
                startActivity(a);
            }
        });
    }
}