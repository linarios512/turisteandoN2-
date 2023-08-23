package com.example.turismov3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.turismov3.adaptadores.AdaptadorHoteles;
import com.example.turismov3.adaptadores.AdaptadorRestaurantes;
import com.example.turismov3.moldes.MoldeHotel;
import com.example.turismov3.moldes.MoldeRestaurantes;

import java.util.ArrayList;

public class listarestaurantes extends AppCompatActivity {


    ArrayList<MoldeRestaurantes> listarestaurantes=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listarestaurantes);
        recyclerView=findViewById(R.id.listadinamicarestaurantes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadorRestaurantes adaptadorRestaurantes=new AdaptadorRestaurantes(listarestaurantes);
        recyclerView.setAdapter(adaptadorRestaurantes);

    }

    public void llenarListaConDatos(){
        listarestaurantes.add(new MoldeRestaurantes("Restaurante Oregano",R.drawable.fotorestaurante1,"3102563245","60000","Filet Mignon"));
        listarestaurantes.add(new MoldeRestaurantes("Restaurante Flor de Lis",R.drawable.fotorestaurante2,"3102563245","65000","Pargo Rojo"));
        listarestaurantes.add(new MoldeRestaurantes("Restaurante Parisino",R.drawable.fotorestaurante3,"3102563245","40000","Camarones a la Parmesana"));
        listarestaurantes.add(new MoldeRestaurantes("Restaurante Rincon del Steak",R.drawable.fotorestaurante4,"3102563245","45000","Cazuela de frijoles"));
        listarestaurantes.add(new MoldeRestaurantes("Restaurante Tikka",R.drawable.fotorestaurante5,"3102563245","50000","Trucha al ajillo"));

    }

}