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


public class destinosActivity_2 extends AppCompatActivity {
    private RecyclerView recyclerViewDestinos;
    private RecyclerViewAdaptador adaptadorDestinos;
    Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinos_2);
        recyclerViewDestinos = (RecyclerView)findViewById(R.id.recyclerview_destinos);
        recyclerViewDestinos.setLayoutManager(new LinearLayoutManager(this));
        adaptadorDestinos = new RecyclerViewAdaptador(obtenerRutas());
        recyclerViewDestinos.setAdapter(adaptadorDestinos);

        home = (Button)findViewById(R.id.button_ruta);


        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent ir_rutas = new Intent(destinosActivity_2.this, Ruta_3.class);
                startActivity(ir_rutas);

            }
        });


    }

    public List<MostrarDatos> obtenerRutas(){
        List<MostrarDatos> datos = new ArrayList<>();

        datos.add(new MostrarDatos("Destino","Juarez",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","El hospital viejo",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","Jardinez del sur",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","Plaza patio",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","Plaza San francisco",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","Puente de la UTEC",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","La preferida",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","La villita",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","La Sonora",R.drawable.logo));

        return datos;




    }
}
