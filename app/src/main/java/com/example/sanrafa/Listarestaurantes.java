package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sanrafa.adaptadores.Adaptadorhotel;
import com.example.sanrafa.adaptadores.Adaptadorrestaurante;
import com.example.sanrafa.moldes.Hotel;
import com.example.sanrafa.moldes.Restaurante;

import java.util.ArrayList;

public class Listarestaurantes extends AppCompatActivity {

    ArrayList<Restaurante> listarestaurantes= new ArrayList<>();
    RecyclerView recyclerViewRestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listarestaurantes);

        recyclerViewRestaurantes=findViewById(R.id.listadinamicarestaurantes);
        recyclerViewRestaurantes.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearlistadeRestaurantes();
        Adaptadorrestaurante adaptador =new Adaptadorrestaurante(listarestaurantes);
        recyclerViewRestaurantes.setAdapter(adaptador);
    }
    public void crearlistadeRestaurantes(){
        listarestaurantes.add(new Restaurante("CAFÉ JOSÉ MARIA","6000 pesos","Posiblemente la mejor panaderia de Concepción sin duda alguna aún si en realidad ofrecen mucho más y puedes comer unas pizzas divinas.¡no te lo pierda!","313-7996900","Carrera Santander No. 22-13 camino Alto de la Virgen",4,R.drawable.mariaa));
        listarestaurantes.add(new Restaurante("SABE ARTESANAL","7000 pesos","Quieres comer unas pizzas divinas o deleitarte con su rica variedad de cafés o cervezas artesanales.¡no te lo pierda!","311-4323737","Carrera Santander No. 22-13 camino Alto de la Virgen",4,R.drawable.restaurante3));
        listarestaurantes.add(new Restaurante("CAFÉ AVELÍ","13000 pesos","¡Este nuevo lugar para deleitar el paladar es simplemente genial! Entren a probar su café de origen, sus pasteles deliciosos."," 311-4323737","Carrera Santander No. 21-72, Esqu. Verde, cerca Comando Policía",4,R.drawable.avelii));
        listarestaurantes.add(new Restaurante("PARRILLA EL SOLAR","2000 pesos","El Solar se ha convertido el restaurante más apetecido para los buenos paladares y es, sin ninguna duda, el restaurante con la mejor carta o menú del pueblo.","311-6105018","Carrera Santander",4,R.drawable.parrilla));
        listarestaurantes.add(new Restaurante("RESTAURANTE RANCHITO","16000 pesos", "Posiblemente el restaurante más \"clásico\" entre turistas donde saborear un almuerzo criollo en Concepción." ,"312-8507389","Parque Principal costado izquierdo",5,R.drawable.restaurante3si));
        listarestaurantes.add(new Restaurante("RESTAURANTE CAFETTO","15000 pesos","Un lugar diferente para compartir: creado por Santiago, su objetivo principal es ofrecer una gran variedad de bebidas y comidas, entre las cuales tortillas, con ricos batidos, granizados y licores." ,"319-5104046","Carrera Santander",5,R.drawable.cafettto));

    }
}