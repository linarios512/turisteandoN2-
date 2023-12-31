package com.example.turismov3.adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turismov3.AmpliandoHotel;
import com.example.turismov3.R;
import com.example.turismov3.moldes.MoldeHotel;

import java.util.ArrayList;

public class AdaptadorHoteles extends RecyclerView.Adapter<AdaptadorHoteles.viewHolder>{  // adaptador de un recycle view

    //Todo adaptador tiene una lista de elementos
    public ArrayList<MoldeHotel> ListaHoteles;

    //creamos un constructor vacio
    public AdaptadorHoteles() {
    }


    //creamos un constructor lleno
    public AdaptadorHoteles(ArrayList<MoldeHotel> listaHoteles) {
        this.ListaHoteles = listaHoteles;
    }

    @NonNull
    @Override
    public AdaptadorHoteles.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //esta parte de codigo permite crear N copias del molde grafico
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorHoteles.viewHolder holder, int position) {
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
            contactoHotel=itemView.findViewById(R.id.telefonolistahotel);

        }

        public void actualizarDatos(MoldeHotel moldeHotel) {
            fotoHotel.setImageResource(moldeHotel.getFoto());
            nombreHotel.setText(moldeHotel.getNombre());
            precioHotel.setText(moldeHotel.getPrecio());
            contactoHotel.setText(moldeHotel.getTelefono());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(itemView.getContext(), AmpliandoHotel.class);
                    intent.putExtra("datoshotel",moldeHotel);
                    itemView.getContext().startActivity(intent);

                }
            });

        }
    }
}

//un package es una carpeta que guarda clases
//adaptador: crea copias del molde y java
//apunadores en memoria: permiten que apunte a distintos sectores de la memoria
//un arreglo indexado son aquellos numeros con los cuales se conocen las variables, van desde cero
//lista dinamica: lista que cambia de tamaño de acuerdo a los elementos que lleguen
//array list : arreglo de longitud variable
//recycle view permite sacar las copias de la lista
//on createview holder es la parte del adaptador que dice: cree un elemento grafico>>>>> estara ascociado a un elemento grafico y lo pone en la lista
// infalter : expandir
//viewHolder: pinta un solo elemento
// itemView.findViewById():::: relaciona foto con id
// recyclerview: importamos desde gradle para crear la lista

