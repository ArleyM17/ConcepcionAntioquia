package com.example.sanrafa.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sanrafa.R;
import com.example.sanrafa.moldes.Hotel;

import java.util.ArrayList;

public class Adaptadorhotel extends RecyclerView.Adapter<Adaptadorhotel.viewHolder> {

    //Atributos de clase
    public ArrayList<Hotel> listaHoteles;

    public Adaptadorhotel() {
    }

    public Adaptadorhotel(ArrayList<Hotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }

    @NonNull
    @Override
    public Adaptadorhotel.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptadorhotel.viewHolder holder, int position) {
        holder.pintarMolde(listaHoteles.get(position));

    }

    @Override
    public int getItemCount() {
        return listaHoteles.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        //asocio elementos de xml molde
        ImageView fotomoldehotel;
        TextView nombrehotel;
        TextView preciohotel;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotomoldehotel=itemView.findViewById(R.id.fotomoldehotel);
            nombrehotel=itemView.findViewById(R.id.nombrehotel);
            preciohotel=itemView.findViewById(R.id.preciohotel);
        }

        public void pintarMolde(Hotel hotel) {
            fotomoldehotel.setImageResource(hotel.getFotografia());
            nombrehotel.setText(hotel.getNombre());
            preciohotel.setText(hotel.getPrecio());
        }
    }
}
