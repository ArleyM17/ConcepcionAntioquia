package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.sanrafa.adaptadores.Adaptadorhotel;
import com.example.sanrafa.moldes.Hotel;

import java.util.ArrayList;

public class Listahoteles extends AppCompatActivity {

    ArrayList<Hotel> listahoteles= new ArrayList<>();
    RecyclerView recyclerViewHoteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listahoteles);

        recyclerViewHoteles=findViewById(R.id.listadinamicahoteles);
        recyclerViewHoteles.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearlistadeHoteles();
        Adaptadorhotel adaptador =new Adaptadorhotel(listahoteles);
        recyclerViewHoteles.setAdapter(adaptador);
    }
    public void crearlistadeHoteles(){
        listahoteles.add(new Hotel("Hotel Villa linda","172000/pareja","Ubicada al comienzo del valle de San Bartolo, en esta hermosa finca puedes encontrar amplias zonas  verdes, acceso al río Concepción.Cerca puedes visitar las Cascadas de Matasanos, a sólo 10 min distancia en vehículo."," 314-6689432","Alejandria Km 1.4",4,R.drawable.hotel2));
        listahoteles.add(new Hotel("Hotel REMANSO DE ANA","70000/pareja","El Remanso de Ana es un lugar pensado especialmente para personas que desean escaparse un rato de la cotidianidad y el ruido de la ciudad, y entrar en conexión con la tranquilidad y la naturaleza.","301-7252414","Carr Palmichal",4,R.drawable.hotel3));
        listahoteles.add(new Hotel("Hotel Dorado Plaza","135000/pareja","Si buscas un lugar tranquilo y acogedor para el descanso y el disfrute del municipio de Concepcion sin duda este apartaestudio es la mejor opción."," 311-6460309","Santander #21-26",4,R.drawable.hotel4));
        listahoteles.add(new Hotel("Hotel Finca Libelula","160000/pareja","A menos de un Km del casco urbano encontramos la Libelula, allí te ofrecemos varios tipos de alojamientos, restaurante, parqueadero, acceso al río."," 318-5949521","Alejandria Km 0.9",3,R.drawable.hotel5));
        listahoteles.add(new Hotel("Hotel ECOFINCA ATHAKA'I","180000/pareja","Atha Ka'i (en idioma indígena la \"energía del ahora\") es una preciosa y sugestiva finca, la única en ofrecer hermosísimas cabañas independientes.  "," 315-3547621","Alejandria Km 1.2",4,R.drawable.hotel6));
        listahoteles.add(new Hotel("Hotel PERLA BLANCA","160000/pareja","ste lindisimo apartamento está perfectamente equipado hasta para 6-8 personas. "," 310-4916005","Calle Alto de la Virgen",4,R.drawable.hotel7));
        listahoteles.add(new Hotel("Hotel CASA MAHANAHIM","200000/pareja","Este maravilloso establecimiento construido con guadua es un verdadero descanso para el alma. Disfruta de su entorno natural.","311-3040815","Vereda La Palma",4,R.drawable.hotel8));
        listahoteles.add(new Hotel("Hotel HOTEL LA VEGA","160000/pareja","Excelente ubicación en la avenida principal, una estructura relativamente nueva del pueblo-"," 314-7624429","Tulio Ospina",4,R.drawable.hotel9));
        listahoteles.add(new Hotel("Hotel CABAÑA MOMOTUS","130000/pareja","Si buscas un lugar tranquilo y acogedor para descanso y desconexión esta cabaña sin duda es una gran opción."," 302-5763695","Vereda La Palma",5,R.drawable.hotel10));
    }
}