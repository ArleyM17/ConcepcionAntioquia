package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    //Atributos para referenciar elementos graficos
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonSitios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Asosiacion de las variables con los elementos de XML
        botonHoteles=findViewById(R.id.botonhoteles);
        botonRestaurantes=findViewById(R.id.botonrestaurantes);
        botonSitios=findViewById(R.id.botonsitios);

        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Que se va a hacer cuando se presione el boton
                Toast.makeText(Home.this, "Hizo click en hoteles", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Home.this,Hoteles.class);
                startActivity(intent);

            }
        });
        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Hizo click en Restaurantes", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(Home.this,Restaurantes.class);
                startActivity(intent2);
            }
        });
        botonSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Hizo click en sitios turisticos", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(Home.this,Sitios_Turisticos.class);
                startActivity(intent3);
            }
        });

    }

    //Llamada al menu de opciones
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    //Que hacer en el menu
    public boolean onOptionsItemSelected(MenuItem item){
        int itemseleccionado=item.getItemId();

        if (itemseleccionado== R.id.opcion1){
            Toast.makeText(this, "Presionó opción 1", Toast.LENGTH_SHORT).show();
        } else if (itemseleccionado==R.id.opcion2) {
            Toast.makeText(this, "Presionó opción 2", Toast.LENGTH_SHORT).show();
        } else if (itemseleccionado==R.id.opcion3) {
            Toast.makeText(this, "Presionó opción 3", Toast.LENGTH_SHORT).show();
        } else if (itemseleccionado==R.id.opcion4) {
            Toast.makeText(this, "Presionó opción 4", Toast.LENGTH_SHORT).show();
            Intent intentresena= new Intent(Home.this, Resena.class);
            startActivity(intentresena);
        } else if (itemseleccionado==R.id.opcion5) {
            Toast.makeText(this, "Presionó opción 5", Toast.LENGTH_SHORT).show();
            Intent intentacerca = new Intent(Home.this, AcercaDe.class);
            startActivity(intentacerca);
        }
        return super.onOptionsItemSelected(item);
    }
}