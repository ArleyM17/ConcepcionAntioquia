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
import com.example.sanrafa.moldes.Sitios;

import java.util.ArrayList;

public class Adaptadorsitios extends RecyclerView.Adapter<Adaptadorsitios.viewHolder> {

    public ArrayList<Sitios> listaSitios;

    public Adaptadorsitios() {
    }

    public Adaptadorsitios(ArrayList<Sitios> listaSitios) {
        this.listaSitios = listaSitios;
    }

    @NonNull
    @Override
    public Adaptadorsitios.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldesitios,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptadorsitios.viewHolder holder, int position) {
        holder.pintarMolde(listaSitios.get(position));
    }

    @Override
    public int getItemCount() {
        return listaSitios.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotomoldesitio;
        TextView nombresitio;
        TextView contactositio;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotomoldesitio=itemView.findViewById(R.id.fotomoldesitio);
            nombresitio=itemView.findViewById(R.id.nombresitio);
            contactositio=itemView.findViewById(R.id.contactositio);
        }

        public void pintarMolde(Sitios sitios) {
            fotomoldesitio.setImageResource(sitios.getFotografia());
            nombresitio.setText(sitios.getNombre());
            contactositio.setText(sitios.getTelefono());
        }
    }
}
