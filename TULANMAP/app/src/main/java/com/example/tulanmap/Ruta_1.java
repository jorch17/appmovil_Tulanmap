package com.example.tulanmap;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ruta_1 extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruta_1);

        btn=findViewById(R.id.home_1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Ruta_1.this, MainActivity.class);
                startActivity(a);
            }
        });

        btn=findViewById(R.id.paradas_1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Ruta_1.this, destinosActivity.class);
                startActivity(a);
            }
        });
        btn=findViewById(R.id.tarifas_1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Ruta_1.this, Tarifas_1.class);
                startActivity(a);
            }
        });
    }
}