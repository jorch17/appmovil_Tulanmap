package com.example.tulanmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mapasActivity extends AppCompatActivity {

    Button home;
    Button tulanCuautepec;
    Button lavillita;
    Button sonora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapas);

        home = (Button)findViewById(R.id.button_ruta);
        tulanCuautepec =(Button)findViewById(R.id.Mapa_1);
        lavillita =(Button)findViewById(R.id.Mapa_2);
        sonora = (Button)findViewById(R.id.Mapa_3);


        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent ir_rutas = new Intent(mapasActivity.this, MainActivity.class);
                startActivity(ir_rutas);

            }
        });

        tulanCuautepec.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent ir_mapa1 = new Intent(mapasActivity.this, Mapa_1.class);
                startActivity(ir_mapa1);

            }
        });

        lavillita.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent ir_mapa2 = new Intent(mapasActivity.this, Mapa_2.class);
                startActivity(ir_mapa2);

            }
        });

        sonora.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent ir_mapa3 = new Intent(mapasActivity.this, Mapa_3.class);
                startActivity(ir_mapa3);

            }
        });


    }
}
