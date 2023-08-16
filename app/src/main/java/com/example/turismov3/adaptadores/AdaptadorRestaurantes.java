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

import java.util.ArrayList;

public class AdaptadorRestaurantes {

    public ArrayList<MoldeHotel> ListaHoteles;

    //creamos un constructor vacio
    public adaptadorRestaurantes() {
    }


    //creamos un constructor lleno
    public adaptadorRestaurantes(ArrayList<MoldeHotel> listaHoteles) {
        this.ListaHoteles = listaHoteles;
    }

    @NonNull
    @Override
    public adaptadorHoteles.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //esta parte de codigo permite crear N copias del molde grafico
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel,null,false);
        return new adaptadorRestaurantes.viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull adaptadorHoteles.viewHolder holder, int position) {
        holder.actualizarDatos(ListaHoteles.get(position));

    }

    @Override
    public int getItemCount() {
        return ListaHoteles.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView fotoHotel;
        TextView nombreHotel;
        TextView precioHotel;
        TextView contactoHotel;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoHotel=itemView.findViewById(R.id.fotolistahotel);
            nombreHotel=itemView.findViewById(R.id.nombrelistahotel);
            precioHotel=itemView.findViewById(R.id.preciolistahotel);
            contactoHotel=itemView.findViewById(R.id.contactolistahotel);

        }

        public void actualizarDatos(MoldeHotel moldeHotel) {
            fotoHotel.setImageResource(moldeHotel.getFoto());
            nombreHotel.setText(moldeHotel.getNombre());
            precioHotel.setText(moldeHotel.getPrecio());
            contactoHotel.setText(moldeHotel.);

        }
    }
}

}
