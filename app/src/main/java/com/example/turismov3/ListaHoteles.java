package com.example.turismov3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.turismov3.adaptadores.AdaptadorHoteles;
import com.example.turismov3.moldes.MoldeHotel;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<MoldeHotel> listaHoteles=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView=findViewById(R.id.listadinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadorHoteles adaptadorHoteles=new AdaptadorHoteles(listaHoteles);
        recyclerView.setAdapter(adaptadorHoteles);
    }
    public void llenarListaConDatos(){
        listaHoteles.add(new MoldeHotel("Hotel La Mansión","$150000", "3225605896",R.drawable.fotohotel1,"hotel agradable",R.drawable.fotohotel1));
        listaHoteles.add(new MoldeHotel("Hotel Guatapé express","$2000000", "3225605896",R.drawable.fotohotel2,"hotel agradable",R.drawable.fotohotel1));
        listaHoteles.add(new MoldeHotel("Hotel La Piedra","$250000", "3225605896",R.drawable.fotohotel3,"hotel agradable",R.drawable.fotohotel1));
        listaHoteles.add(new MoldeHotel("Hotel Glamping guatapé","$300000", "3225605896",R.drawable.fotohotel4,"hotel agradable",R.drawable.fotohotel1));
        listaHoteles.add(new MoldeHotel("Hotel La Fontana","$350000", "3225605896",R.drawable.fotohotel5,"hotel agradable",R.drawable.fotohotel1));
    }

}