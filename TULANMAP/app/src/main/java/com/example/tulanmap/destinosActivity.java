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

public class destinosActivity extends AppCompatActivity {

    private RecyclerView recyclerViewDestinos;
    private RecyclerViewAdaptador adaptadorDestinos;

    Button home;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinos);

        recyclerViewDestinos = (RecyclerView)findViewById(R.id.recyclerview_destinos);
        recyclerViewDestinos.setLayoutManager(new LinearLayoutManager(this));
        adaptadorDestinos = new RecyclerViewAdaptador(obtenerRutas());
        recyclerViewDestinos.setAdapter(adaptadorDestinos);

        home = (Button)findViewById(R.id.button_ruta);


        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent ir_rutas = new Intent(destinosActivity.this, Ruta_1.class);
                startActivity(ir_rutas);

            }
        });


    }

    public List<MostrarDatos> obtenerRutas(){
        List<MostrarDatos> datos = new ArrayList<>();
        datos.add(new MostrarDatos("Parada","La Y griega",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","Panteon",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","La llave",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","Secundaria 56",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","El puente",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","El banco",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","La curva",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","La Gasolineria",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","1° entrada de la esperanza",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","Las trancas",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","Tepantitla",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","El columpio",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","Centro de salud",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","El pedregal",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","El callejon",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","La sanja",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","La pasadita",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","El espejo",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","Los conos",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","San juan",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","El moino",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","Aurrera",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","Moreda",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","Santa martha",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","La guadalupana",R.drawable.logo));
        datos.add(new MostrarDatos("Parada","Cuautepec",R.drawable.logo));
        return datos;




    }
}
