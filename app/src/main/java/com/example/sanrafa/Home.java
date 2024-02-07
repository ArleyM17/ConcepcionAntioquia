package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Locale;

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
            this.cambiarIdioma("en");
            Intent intentingles= new Intent(Home.this,Home.class);
            startActivity(intentingles);
        } else if (itemseleccionado==R.id.opcion2) {
            this.cambiarIdioma("es");
            Intent intentingles= new Intent(Home.this,Home.class);
            startActivity(intentingles);
        } else if (itemseleccionado==R.id.opcion3) {
            this.cambiarIdioma("de");
            Intent intentingles= new Intent(Home.this,Home.class);
            startActivity(intentingles);
        } else if (itemseleccionado==R.id.opcion4) {
            Intent intentresena= new Intent(Home.this, Resena.class);
            startActivity(intentresena);
        } else if (itemseleccionado==R.id.opcion5) {
            Intent intentacerca = new Intent(Home.this, AcercaDe.class);
            startActivity(intentacerca);
        }
        return super.onOptionsItemSelected(item);
    }

    public void cambiarIdioma(String idioma) {
        //configuracion de idioma
        Locale lenguaje = new Locale(idioma);
        Locale.setDefault(lenguaje);
        //configuracion global
        Configuration configuraciontelefono = getResources().getConfiguration();
        configuraciontelefono.locale = lenguaje;

        //Ejecutar configuracion
        getBaseContext().getResources().updateConfiguration(configuraciontelefono, getBaseContext().getResources().getDisplayMetrics());
    }
}