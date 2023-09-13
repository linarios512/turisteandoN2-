package com.example.turismov3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.turismov3.moldes.MoldeHotel;
import com.example.turismov3.moldes.MoldeSitiosTuristicos;

public class AmpliandoTurismo extends AppCompatActivity {

    MoldeSitiosTuristicos moldeSitiosTuristicos;
    ImageView fotoampliandositiosTuristicos;
    TextView nombreampliandositiosTuristicos;
    TextView precioampliandositiosTuristicos;
    TextView telefonoampliandositiosTuristicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_turismo);

        fotoampliandositiosTuristicos=findViewById(R.id.fotoampliandositio);
        nombreampliandositiosTuristicos=findViewById(R.id.nombreampliandositios);
        precioampliandositiosTuristicos=findViewById(R.id.precioampliandositios);
        telefonoampliandositiosTuristicos=findViewById(R.id.telefonoampliandositios);
        moldeSitiosTuristicos=(MoldeSitiosTuristicos) getIntent().getSerializableExtra("datossitiosTuristicos");

        //cargando la informacion en los componentes graficos
        
        fotoampliandositiosTuristicos.setImageResource(moldeSitiosTuristicos.getFoto());
        nombreampliandositiosTuristicos.setText(moldeSitiosTuristicos.getNombre());
        precioampliandositiosTuristicos.setText(moldeSitiosTuristicos.getPrecio());
        telefonoampliandositiosTuristicos.setText(moldeSitiosTuristicos.getTelefono());
    }
}