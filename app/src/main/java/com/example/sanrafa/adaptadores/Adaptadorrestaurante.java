package com.example.sanrafa.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sanrafa.HotelesAmpliados;
import com.example.sanrafa.R;
import com.example.sanrafa.RestaurantesAmpliados;
import com.example.sanrafa.moldes.Hotel;
import com.example.sanrafa.moldes.Restaurante;

import java.util.ArrayList;

public class Adaptadorrestaurante extends RecyclerView.Adapter<Adaptadorrestaurante.viewHolder> {

    public ArrayList<Restaurante> listaRestaurantes;

    public Adaptadorrestaurante() {
    }

    public Adaptadorrestaurante(ArrayList<Restaurante> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public Adaptadorrestaurante.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurante,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptadorrestaurante.viewHolder holder, int position) {
        holder.pintarMolde(listaRestaurantes.get(position));
    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView fotomolderestaurante;
        TextView nombrerestaurante;
        TextView preciorestaurante;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotomolderestaurante=itemView.findViewById(R.id.fotomolderestaurante);
            nombrerestaurante=itemView.findViewById(R.id.nombrerestaurante);
            preciorestaurante=itemView.findViewById(R.id.preciorestaurante);
        }

        public void pintarMolde(Restaurante restaurante) {
            fotomolderestaurante.setImageResource(restaurante.getFotografia());
            nombrerestaurante.setText(restaurante.getNombre());
            preciorestaurante.setText(restaurante.getPrecio());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), RestaurantesAmpliados.class);
                    intent.putExtra("datosrestaurante",restaurante);
                    itemView.getContext().startActivity(intent);

                }
            });
        }
    }
}