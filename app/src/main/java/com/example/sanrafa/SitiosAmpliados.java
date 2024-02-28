package com.example.sanrafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.sanrafa.moldes.Hotel;
import com.example.sanrafa.moldes.Sitios;

public class SitiosAmpliados extends AppCompatActivity {

    Sitios datossitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios_ampliados);

        datossitios=(Sitios) getIntent().getSerializableExtra("datossitios");
        Toast.makeText(this, datossitios.getNombre(), Toast.LENGTH_SHORT).show();
    }
}