package com.example.tulanmap;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ruta_2 extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruta_2);
        btn=findViewById(R.id.home_2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Ruta_2.this, MainActivity.class);
                startActivity(a);
            }
        });

        btn=findViewById(R.id.paradas_2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Ruta_2.this, Paradas_2.class);
                startActivity(a);
            }
        });
        btn=findViewById(R.id.tarifas_2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Ruta_2.this, Tarifas_2.class);
                startActivity(a);
            }
        });
    }
}