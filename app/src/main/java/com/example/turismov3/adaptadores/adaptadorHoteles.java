package com.example.turismov3.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.turismov3.R;
import com.example.turismov3.moldes.MoldeHotel;

import java.util.ArrayList;

public class adaptadorHoteles extends RecyclerView .Adapter<adaptadorHoteles.viewHolder>{  // adaptador de un recycle view

    //Todo adaptador tiene una lista de elementos
    public ArrayList<MoldeHotel> ListaHoteles;

    //creamos un constructor vacio
    public adaptadorHoteles() {
    }


    //creamos un constructor lleno
    public adaptadorHoteles(ArrayList<MoldeHotel> listaHoteles) {
        this.ListaHoteles = listaHoteles;
    }






    @NonNull
    @Override
    public adaptadorHoteles.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //esta parte de codigo permite crear N copias del molde grafico
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel,null,false);
        return new parent(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull adaptadorHoteles.viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}










//un package es una carpeta que guarda clases
//adaptador: crea copias del molde y java
//apunadores en memoria: permiten que apunte a distintos sectores de la memoria
//un arreglo indexado son aquellos numeros con los cuales se conocen las variables, van desde cero
//lista dinamica: lista que cambia de tamaño de acuerdo a los elementos que lleguen
//array list : arreglo de longitud variable
//recycle view permite sacar las copias de la lista
//on createview holder estara ascociado a un elemento grafico y lopone en la lista