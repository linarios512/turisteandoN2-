package com.example.turismov3.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turismov3.R;
import com.example.turismov3.moldes.MoldeHotel;
import com.example.turismov3.moldes.MoldeRestaurantes;

import java.util.ArrayList;

public class AdaptadorRestaurantes extends RecyclerView.Adapter<AdaptadorRestaurantes.viewHolder> {

    public ArrayList<MoldeRestaurantes> listaRestaurantes;

    //creamos un constructor vacio


    public AdaptadorRestaurantes() {
    }

    //creamos un constructor lleno
    public AdaptadorRestaurantes(ArrayList<MoldeRestaurantes> listaHoteles) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public AdaptadorRestaurantes.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //esta parte de codigo permite crear N copias del molde grafico
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel,null,false);
        return new AdaptadorRestaurantes.viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.actualizarDatos(listaRestaurantes.get(position));
    }



    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView fotoRestaurantes;
        TextView nombreRestaurantes;
        TextView precioRestaurantes;
        TextView contactoRestaurantes;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoRestaurantes=itemView.findViewById(R.id.fotolistarestaurantes);
            nombreRestaurantes=itemView.findViewById(R.id.nombrelistarestaurantes);
            precioRestaurantes=itemView.findViewById(R.id.preciolistarestaurantes);
            contactoRestaurantes=itemView.findViewById(R.id.telefonolistarestaurante);
        }

        public void actualizarDatos(MoldeRestaurantes moldeRestaurantes) {
            fotoRestaurantes.setImageResource(moldeRestaurantes.getFoto());
            nombreRestaurantes.setText(moldeRestaurantes.getNombre());
            precioRestaurantes.setText(moldeRestaurantes.getRangoprecio());
            contactoRestaurantes.setText(moldeRestaurantes.getTelefono());
        }
    }
}


