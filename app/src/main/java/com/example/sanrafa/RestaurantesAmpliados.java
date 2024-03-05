package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sanrafa.moldes.Hotel;
import com.example.sanrafa.moldes.Restaurante;

public class RestaurantesAmpliados extends AppCompatActivity {

    Restaurante datosrestaurante;

    TextView tituloRestaurante;
    ImageView imagenRestaurante;
    TextView calificacionRestaurante;
    TextView descripcionRestaurante;
    TextView precioRestaurante;
    TextView telefonoRestaurante;
    TextView direccionRestaurante;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes_ampliados);

        tituloRestaurante=findViewById(R.id.TituloAmpliadorestaurantes);
        imagenRestaurante=findViewById(R.id.fotoampliandorestaurantes);
        calificacionRestaurante=findViewById(R.id.calificacionrestaurantes);
        descripcionRestaurante=findViewById(R.id.descripcionrestaurantesampliados);
        precioRestaurante=findViewById(R.id.preciorestaurantesampliados);
        telefonoRestaurante=findViewById(R.id.telefonorestaurante);
        direccionRestaurante=findViewById(R.id.direccionrestaurantes);

        datosrestaurante=(Restaurante) getIntent().getSerializableExtra("datosrestaurante");
        Toast.makeText(this, datosrestaurante.getNombre(), Toast.LENGTH_SHORT).show();

        tituloRestaurante.setText(datosrestaurante.getNombre());
        imagenRestaurante.setImageResource(datosrestaurante.getFotografia());
        calificacionRestaurante.setText(Integer.toString( datosrestaurante.getCalificacion()));
        descripcionRestaurante.setText(datosrestaurante.getDescripcion());
        precioRestaurante.setText(datosrestaurante.getPrecio());
        telefonoRestaurante.setText(datosrestaurante.getTelefono());
        direccionRestaurante.setText(datosrestaurante.getDireccion());
    }
}