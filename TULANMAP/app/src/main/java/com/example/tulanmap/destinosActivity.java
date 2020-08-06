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

        home = (Button)findViewById(R.id.button_home);


        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent ir_rutas = new Intent(destinosActivity.this, MainActivity.class);
                startActivity(ir_rutas);

            }
        });


    }

    public List<MostrarDatos> obtenerRutas(){
        List<MostrarDatos> datos = new ArrayList<>();
        datos.add(new MostrarDatos("Destino","La Y griega",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","Panteon",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","La llave",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","Secundaria 56",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","El puente",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","El banco",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","La curva",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","La Gasolineria",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","1° entrada de la esperanza",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","Las trancas",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","Tepantitla",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","El columpio",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","Centro de salud",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","El pedregal",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","El callejon",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","La sanja",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","La pasadita",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","El espejo",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","Los conos",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","San juan",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","El moino",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","Aurrera",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","Moreda",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","Santa martha",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","La guadalupana",R.drawable.logo));
        datos.add(new MostrarDatos("Destino","Cuautepec",R.drawable.logo));
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
