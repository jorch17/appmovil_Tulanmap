package com.example.tulanmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button ir_rutas;
    Button destino;
    Button mapas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //===================================================================================
        ir_rutas = (Button)findViewById(R.id.button_rutas);
        destino =(Button)findViewById(R.id.button_destino);
        mapas =(Button)findViewById(R.id.button_mapas);


        ir_rutas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent ir_rutas = new Intent(MainActivity.this, rutasActivity.class);
                startActivity(ir_rutas);

            }
        });

        destino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent destino = new Intent(MainActivity.this,destinosActivity.class);
                startActivity(destino);
            }
        });

        mapas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mapas = new Intent(MainActivity.this,mapasActivity.class);
                startActivity(mapas);
            }
        });

    }


}
