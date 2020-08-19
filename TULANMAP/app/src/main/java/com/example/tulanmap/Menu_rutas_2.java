package com.example.tulanmap;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class Menu_rutas_2 extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_rutas_2);

        btn=findViewById(R.id.espalda);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Menu_rutas_2.this, Menu_rutas.class);
                startActivity(a);
            }
        });
        btn=findViewById(R.id.boton_3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Menu_rutas_2.this, Ruta_4.class);
                startActivity(a);
            }
        });
        btn=findViewById(R.id.boton_4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Menu_rutas_2.this, Ruta_5.class);
                startActivity(a);
            }
        });
    }
}