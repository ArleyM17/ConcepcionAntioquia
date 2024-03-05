package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sanrafa.moldes.Hotel;

public class HotelesAmpliados extends AppCompatActivity {

    Hotel datoshotel;

    TextView tituloHotel;
    ImageView imagenHotel;
    TextView calificacionHotel;
    TextView descripcionHotel;
    TextView precioHotel;
    TextView telefonoHotel;
    TextView direccionHotel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles_ampliados);

        tituloHotel=findViewById(R.id.TituloAmpliadohoteles);
        imagenHotel=findViewById(R.id.fotoampliandohoteles);
        calificacionHotel=findViewById(R.id.calificacionhoteles);
        descripcionHotel=findViewById(R.id.descripcionhotelesampliados);
        precioHotel=findViewById(R.id.preciohotelesampliados);
        telefonoHotel=findViewById(R.id.telefonohoteles);
        direccionHotel=findViewById(R.id.direccionhoteles);

        datoshotel=(Hotel)getIntent().getSerializableExtra("datoshotel");
        Toast.makeText(this, datoshotel.getNombre(), Toast.LENGTH_SHORT).show();
        tituloHotel.setText(datoshotel.getNombre());
        imagenHotel.setImageResource(datoshotel.getFotografia());
        calificacionHotel.setText(Integer.toString( datoshotel.getCalificacion()));
        descripcionHotel.setText(datoshotel.getDescripcion());
        precioHotel.setText(datoshotel.getPrecio());
        telefonoHotel.setText(datoshotel.getTelefono());
        direccionHotel.setText(datoshotel.getDireccion());
    }
}