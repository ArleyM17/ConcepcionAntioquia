package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sanrafa.moldes.Hotel;
import com.example.sanrafa.moldes.Sitios;

public class SitiosAmpliados extends AppCompatActivity {

    Sitios datossitios;

    TextView tituloSitios;
    ImageView imagenSitios;
    TextView calificacionSitios;
    TextView direccionSitios;
    TextView telefonoSitios;
    TextView descripcionSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios_ampliados);

        tituloSitios=findViewById(R.id.TituloAmpliadositios);
        imagenSitios=findViewById(R.id.fotoampliandositios);
        calificacionSitios=findViewById(R.id.calificacionsitios);
        direccionSitios=findViewById(R.id.direccionsitios);
        telefonoSitios=findViewById(R.id.telefonositios);
        descripcionSitios=findViewById(R.id.descripcionsitiosampliados);

        datossitios=(Sitios) getIntent().getSerializableExtra("datossitios");
        Toast.makeText(this, datossitios.getNombre(), Toast.LENGTH_SHORT).show();

        tituloSitios.setText(datossitios.getNombre());
        imagenSitios.setImageResource(datossitios.getFotografia());
        calificacionSitios.setText(Integer.toString( datossitios.getCalificacion()));
        descripcionSitios.setText(datossitios.getDescripcion());
        telefonoSitios.setText(datossitios.getTelefono());
        direccionSitios.setText(datossitios.getDireccion());
    }
}