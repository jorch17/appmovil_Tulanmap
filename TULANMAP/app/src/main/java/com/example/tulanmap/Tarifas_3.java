package com.example.tulanmap;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.os.Bundle;
import android.widget.Button;
import android.os.Bundle;

public class Tarifas_3 extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarifas_3);

        btn=findViewById(R.id.atras_4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Tarifas_3.this, Ruta_3.class);
                startActivity(a);
            }
        });

    }
}
