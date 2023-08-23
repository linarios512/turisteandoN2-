package com.example.turismov3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.turismov3.adaptadores.AdaptadorRestaurantes;
import com.example.turismov3.adaptadores.AdaptadorSitiosTuristicos;
import com.example.turismov3.moldes.MoldeRestaurantes;
import com.example.turismov3.moldes.MoldeSitiosTuristicos;

import java.util.ArrayList;

public class ListaSitiosTuristicos extends AppCompatActivity {
    ArrayList<MoldeSitiosTuristicos> listaSitiosTuristicos=new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios_turisticos);
        recyclerView=findViewById(R.id.listadinamicasitiosturisticos);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadorSitiosTuristicos adaptadorSitiosTuristicos=new AdaptadorSitiosTuristicos(listaSitiosTuristicos);
        recyclerView.setAdapter(adaptadorSitiosTuristicos);


    }
    public void llenarListaConDatos(){
        listaSitiosTuristicos.add(new MoldeSitiosTuristicos("Tour por el Pueblo","Lina Maria Rios ","3204587956","150000", R.drawable.fotositiost1));
        listaSitiosTuristicos.add(new MoldeSitiosTuristicos("Visita a la Piedra","Lina Maria Rios ","3204587956","250000", R.drawable.fotositiost2));
        listaSitiosTuristicos.add(new MoldeSitiosTuristicos("Tour en Helicoptero ","Lina Maria Rios ","3204587956","6000000", R.drawable.fotositiost3));
        listaSitiosTuristicos.add(new MoldeSitiosTuristicos("Tour Natural","Lina Maria Rios ","3204587956","200000", R.drawable.fotositiost4));
        listaSitiosTuristicos.add(new MoldeSitiosTuristicos("Tour Nativo","Lina Maria Rios ","3204587956","100000", R.drawable.fotositiost5));

    }
}