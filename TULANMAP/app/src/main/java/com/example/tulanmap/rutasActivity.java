package com.example.tulanmap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class rutasActivity extends AppCompatActivity {

    Button home;

    private RecyclerView recyclerViewRutas;
    private RecyclerViewAdaptador adaptadorRutas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutas);


        home = (Button)findViewById(R.id.button_home);


        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent ir_rutas = new Intent(rutasActivity.this, MainActivity.class);
                startActivity(ir_rutas);

            }
        });

        recyclerViewRutas = (RecyclerView)findViewById(R.id.recyclerview_rutas);
        recyclerViewRutas.setLayoutManager(new LinearLayoutManager(this));
        adaptadorRutas = new RecyclerViewAdaptador(obtenerRutas());
        recyclerViewRutas.setAdapter(adaptadorRutas);


    }


    public List<MostrarDatos> obtenerRutas(){
        List<MostrarDatos> datos = new ArrayList<>();
        datos.add(new MostrarDatos("Ruta","Tulancingo-Cuautepec",R.drawable.tulancingo_cuautepec));
        datos.add(new MostrarDatos("Ruta","La villita",R.drawable.la_villita));
        datos.add(new MostrarDatos("Ruta","Tulancigo-Sonora",R.drawable.sonora_ampliacion));
        datos.add(new MostrarDatos("Ruta","Cuautepec-Tulancingo",R.drawable.tulancingo));
        return datos;




    }
}
