package com.example.tulanmap;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.os.Bundle;
import android.os.Bundle;
import android.widget.Button;

public class Paradas_2_1 extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paradas_2_1);
        btn=findViewById(R.id.atras_10);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(Paradas_2_1.this, Ruta_2.class);
                startActivity(a);
            }
        });

    }
}