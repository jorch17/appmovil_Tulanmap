package com.example.tulanmap;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.os.Bundle;
import android.os.Bundle;
import android.widget.Button;


public class Tarifas_5 extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarifas_5);

        btn=findViewById(R.id.atras_8);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Tarifas_5.this, Ruta_5.class);
                startActivity(a);
            }
        });

    }
}
