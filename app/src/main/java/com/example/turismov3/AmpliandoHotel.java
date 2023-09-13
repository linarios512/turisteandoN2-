package com.example.turismov3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.turismov3.moldes.MoldeHotel;

public class AmpliandoHotel extends AppCompatActivity {

    MoldeHotel moldeHotel;
    ImageView fotoAmpliandoHotel;
    ImageView fotoAdicionalAmpliandoHotel;
    TextView nombreAmpliandoHotel;
    TextView precioampliandoHotel;
    TextView telefonoampliandohotel;
    TextView resenaampliandohotel;
    TextView comentarioampliandohotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);
        fotoAmpliandoHotel=findViewById(R.id.fotoampliandohotel);
        nombreAmpliandoHotel=findViewById(R.id.nombreampliandohotel);
        precioampliandoHotel=findViewById(R.id.precioampliandohotel);
        telefonoampliandohotel=findViewById(R.id.telefonoampliandohotel);
        resenaampliandohotel=findViewById(R.id.resenaampliandohotel);
        comentarioampliandohotel=findViewById(R.id.textocomentariosampliandohotel);
        fotoAdicionalAmpliandoHotel= findViewById(R.id.fotoampliandohotel2);
        moldeHotel=(MoldeHotel)getIntent().getSerializableExtra("datoshotel");

        //cargando la informacion en los componentes graficos

        fotoAmpliandoHotel.setImageResource(moldeHotel.getFoto());
        nombreAmpliandoHotel.setText(moldeHotel.getNombre());
        precioampliandoHotel.setText(moldeHotel.getPrecio());
        telefonoampliandohotel.setText(moldeHotel.getTelefono());
        resenaampliandohotel.setText(moldeHotel.getResena());
        comentarioampliandohotel.setText(moldeHotel.getComentario());
        fotoAdicionalAmpliandoHotel.setImageResource(moldeHotel.getFotoadicional());
    }
}
