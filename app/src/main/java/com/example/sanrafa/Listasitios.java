package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sanrafa.adaptadores.Adaptadorrestaurante;
import com.example.sanrafa.adaptadores.Adaptadorsitios;
import com.example.sanrafa.moldes.Restaurante;
import com.example.sanrafa.moldes.Sitios;

import java.util.ArrayList;

public class Listasitios extends AppCompatActivity {

    ArrayList<Sitios> listasitios= new ArrayList<>();
    RecyclerView recyclerViewSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listasitios);

        recyclerViewSitios=findViewById(R.id.listadinamicasitios);
        recyclerViewSitios.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearlistadeSitios();
        Adaptadorsitios adaptador =new Adaptadorsitios(listasitios);
        recyclerViewSitios.setAdapter(adaptador);
    }
    public void crearlistadeSitios(){
        listasitios.add(new Sitios("IGLESIA INMACULADA CONCEPCIÓN","La única iglesia del pueblo fue construida en 1814, no obstante la parroquia existiera desde desde el 1774. Presenta una clásica estructura de tres naves con columnas portantes y un lindo altar central.","3126102598","Parque Central",4,R.drawable.sitio2));
        listasitios.add(new Sitios("CALLES EMPEDRADAS","La caracteristica más bonita del pueblo es sin ninguna duda sus hermosas calles antiguas empedradas. Manteniendo completamente intacta su estructura fundacional cada casa mantiene sus colores y portones.","3126102598","Por todo el pueblo",4,R.drawable.sitio3));
        listasitios.add(new Sitios("ALTO DE LA VIRGEN","Es uno de los miradores mas espectaculares que tiene concepción es ideal para fotografías panoramicas, tiene una elevación de 130 metros desde la zona urbana. Después de 123 escalones y 27 curvas podrás disfrutar del lindo panorama de nuestro municipio..","321 7518136","Desde la Plaza José María Córdova es posible ver a mano derecha",4,R.drawable.sitio4));
        listasitios.add(new Sitios("CHARCO DE LOS PAYASOS","Ubicado en la proximidad del casco urbano, es el charco más accesible y popular entre los habitantes de este hermoso pueblo. Ofrece zona de restauración, baños públicos y un hermoso puente sobre el rio Concepción. Su nombre es debido a los circos que se instalaban en la contigua cancha de football, cuando los payasos se bañaban en este rio.","312-8462724","bajando por la calle Uribe Uribe dos cuadras",4,R.drawable.sitio5));

    }
}