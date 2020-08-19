package com.example.tulanmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu_rutas extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_rutas);

        btn=findViewById(R.id.boton);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Menu_rutas.this, Ruta_1.class);
                startActivity(a);
            }
        });
        btn=findViewById(R.id.boton_1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Menu_rutas.this, Ruta_2.class);
                startActivity(a);
            }
        });

        btn=findViewById(R.id.boton_2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Menu_rutas.this, Ruta_3.class);
                startActivity(a);
            }
        });

        btn=findViewById(R.id.proximo);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Menu_rutas.this, Menu_rutas_2.class);
                startActivity(a);
            }
        });
    }
}
