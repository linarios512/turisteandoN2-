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
import com.example.turismov3.moldes.MoldeSitiosTuristicos;

import java.util.ArrayList;

public class AdaptadorSitiosTuristicos extends RecyclerView.Adapter<AdaptadorSitiosTuristicos.viewHolder> {

    public ArrayList<MoldeSitiosTuristicos> listaSitiosTuristicos;

    //creamos un constructor vacio
    public AdaptadorSitiosTuristicos() {
    }


    //creamos un constructor lleno
    public AdaptadorSitiosTuristicos(ArrayList<MoldeSitiosTuristicos> listaHoteles) {
        this.listaSitiosTuristicos = listaSitiosTuristicos;
    }

    @NonNull
    @Override
    public AdaptadorSitiosTuristicos.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //esta parte de codigo permite crear N copias del molde grafico
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel,null,false);
        return new AdaptadorSitiosTuristicos.viewHolder(vista);
    }



    @Override
    public void onBindViewHolder(@NonNull AdaptadorSitiosTuristicos.viewHolder holder, int position) {
        holder.actualizarDatos(listaSitiosTuristicos.get(position));
    }



    @Override
    public int getItemCount() {
        return listaSitiosTuristicos.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView fotositiosTuristicos;
        TextView nombresitiosTuristicos;
        TextView preciositiosTuristicos;
        TextView contactositiosTuristicos;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotositiosTuristicos=itemView.findViewById(R.id.fotolistasitiosTuristicos);
            nombresitiosTuristicos=itemView.findViewById(R.id.nombrelistasitiosTuristicos);
            preciositiosTuristicos=itemView.findViewById(R.id.preciositiosTuristicos);
            contactositiosTuristicos=itemView.findViewById(R.id.telefonolistasitiosTuristicos);
        }

        public void actualizarDatos(MoldeSitiosTuristicos moldeSitiosTuristicos) {
            fotositiosTuristicos.setImageResource(moldeSitiosTuristicos.getFoto());
            nombresitiosTuristicos.setText(moldeSitiosTuristicos.getNombre());
            preciositiosTuristicos.setText(moldeSitiosTuristicos.getPrecio());
            contactositiosTuristicos.setText(moldeSitiosTuristicos.getTelefono());
        }
    }
}


