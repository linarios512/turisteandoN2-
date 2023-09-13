package com.example.turismov3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.turismov3.moldes.MoldeHotel;
import com.example.turismov3.moldes.MoldeRestaurantes;

public class AmpliandoRestaurantes extends AppCompatActivity {

    MoldeRestaurantes moldeRestaurantes;
    ImageView fotoampliandorestaurantes;
    TextView nombreampliandorestaurantes;
    TextView precioampliandorestaurantes;
    TextView telefonoampliandorestaurante;
    TextView resenaampliandorestaurante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurantes);

        fotoampliandorestaurantes=findViewById(R.id.fotoampliandorestaurante);
        nombreampliandorestaurantes=findViewById(R.id.nombreampliandorestaurante);
        precioampliandorestaurantes=findViewById(R.id.precioampliandorestaurante);
        telefonoampliandorestaurante=findViewById(R.id.telefonoampliandorestaurante);
        resenaampliandorestaurante=findViewById(R.id.resenaampliandorestaurantes);
        moldeRestaurantes=(MoldeRestaurantes) getIntent().getSerializableExtra("datosrestaurantes");

        //cargando la informacion en los componentes graficos
        fotoampliandorestaurantes.setImageResource(moldeRestaurantes.getFoto());
        nombreampliandorestaurantes.setText(moldeRestaurantes.getNombre());
        precioampliandorestaurantes.setText(moldeRestaurantes.getRangoprecio());
        telefonoampliandorestaurante.setText(moldeRestaurantes.getTelefono());

    }
}