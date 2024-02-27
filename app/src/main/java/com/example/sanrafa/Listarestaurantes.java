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
        listarestaurantes.add(new Restaurante("CAFÉ JOSÉ MARIA","6000","Posiblemente la mejor panaderia de Concepción sin duda alguna aún si en realidad ofrecen mucho más y puedes comer unas pizzas divinas o deleitarte con su rica variedad de cafés o cervezas artesanales. Uno de mis lugares preferido cada vez que visito el casco urbano, ¡no te lo pierda!","313-7996900","Carrera Santander No. 22-13 camino Alto de la Virgen",4,R.drawable.restaurante2));
        listarestaurantes.add(new Restaurante("SABE ARTESANAL","7000","Posiblemente la mejor panaderia de Concepción sin duda alguna aún si en realidad ofrecen mucho más y puedes comer unas pizzas divinas o deleitarte con su rica variedad de cafés o cervezas artesanales. Uno de mis lugares preferido cada vez que visito el casco urbano, ¡no te lo pierda!","311-4323737","Carrera Santander No. 22-13 camino Alto de la Virgen",4,R.drawable.restaurante3));
        listarestaurantes.add(new Restaurante("CAFÉ AVELÍ","13000","¡Este nuevo lugar para deleitar el paladar es simplemente genial! Entren a probar su café de origen, sus pasteles deliciosos, sus crepes especiales. Diana y Vanessa tendrán siempre una sonrisa para brindarles los mejores cafés y atenderlos de la manera más cordial"," 311-4323737","Carrera Santander No. 21-72, Esqu. Verde, cerca Comando Policía",4,R.drawable.restaurante4));
        listarestaurantes.add(new Restaurante("PARRILLA EL SOLAR","2000","El Solar se ha convertido el restaurante más apetecido para los buenos paladares y es, sin ninguna duda, el restaurante con la mejor carta o menú del pueblo. Si tu plan es disfrutar un plato delicioso no dudes en pasar por El Solar.","311-6105018","Carrera Santander",4,R.drawable.restaurante5));
        listarestaurantes.add(new Restaurante("RESTAURANTE RANCHITO","16000","Posiblemente el restaurante más \"clásico\" entre turistas donde saborear un almuerzo criollo en Concepción. Es un lugar repleto de planticas y suculentas, muchos objetos antiguos lo cual vuelve la espera agradable y placentera. Sus platos son los típicos colombianos a base de arroz, papas, platano y los inmejorables frijoles antioqueños. ¡Aún si escojiste otra alternativa, aprovecha para entrar y observar la linda decoración" ,"312-8507389","Parque Principal costado izquierdo",5,R.drawable.restaurante3si));

    }
}