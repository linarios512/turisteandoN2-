package com.example.turismov3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.turismov3.moldes.MoldeHotel;
import com.example.turismov3.moldes.MoldeSitiosTuristicos;

public class AmpliandoTurismo extends AppCompatActivity {

    MoldeSitiosTuristicos moldeSitiosTuristicos;
    ImageView fotoAdicionalampliandositios;
    ImageView fotoampliandositiosTuristicos;
    TextView nombreampliandositiosTuristicos;
    TextView precioampliandositiosTuristicos;
    TextView telefonoampliandositiosTuristicos;
    TextView resenaampliandositios;
    TextView comentarioampliandositios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_turismo);

        fotoampliandositiosTuristicos=findViewById(R.id.fotoampliandositio);
        nombreampliandositiosTuristicos=findViewById(R.id.nombreampliandositios);
        precioampliandositiosTuristicos=findViewById(R.id.precioampliandositios);
        telefonoampliandositiosTuristicos=findViewById(R.id.telefonoampliandositios);
        resenaampliandositios=findViewById(R.id.resenaampliandositios);
        comentarioampliandositios=findViewById(R.id.textocomentariosampliandositios);
        fotoAdicionalampliandositios=findViewById(R.id.fotoampliandositios2);
        moldeSitiosTuristicos=(MoldeSitiosTuristicos) getIntent().getSerializableExtra("datosturismo");

        //cargando la informacion en los componentes graficos
        
        fotoampliandositiosTuristicos.setImageResource(moldeSitiosTuristicos.getFoto());
        nombreampliandositiosTuristicos.setText(moldeSitiosTuristicos.getNombre());
        precioampliandositiosTuristicos.setText(moldeSitiosTuristicos.getPrecio());
        telefonoampliandositiosTuristicos.setText(moldeSitiosTuristicos.getTelefono());
        comentarioampliandositios.setText(moldeSitiosTuristicos.getComentario());
        resenaampliandositios.setText(moldeSitiosTuristicos.getResena());
        fotoAdicionalampliandositios.setImageResource(moldeSitiosTuristicos.getFotoadicional());
    }
}