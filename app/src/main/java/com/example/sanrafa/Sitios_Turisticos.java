package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sitios_Turisticos extends AppCompatActivity {

    Button botonverSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios_turisticos);
        botonverSitios=findViewById(R.id.botonhomesitios);
        botonverSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sitios_Turisticos.this, Listasitios.class);
                startActivity(intent);
            }
        });
    }
}