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
        listaSitiosTuristicos.add(new MoldeSitiosTuristicos("Tour por el Pueblo","Lina Maria Rios ","31545879563","$200.000 - 400.000", R.drawable.fotositiost1,"Guatapé: Pueblo de colores y la majestuosa Piedra del Peñol, un rincón pintoresco que roba corazones",4f,"Recomendado",R.drawable.fotositios111));
        listaSitiosTuristicos.add(new MoldeSitiosTuristicos("Visita a la Piedra","Lina Maria Rios ","3104587584","$150.000 - 190.000", R.drawable.fotositiost2,"Guatapé, joya de Antioquia: vibrantes calles, lago sereno y la imponente Piedra del Peñol te asombraran",5f,"Buen precio",R.drawable.fotositios222));
        listaSitiosTuristicos.add(new MoldeSitiosTuristicos("Tour en Helicoptero ","Lina Maria Rios ","3224587321","$700.000 - 900.000", R.drawable.fotositiost3,"Guatapé: un paraíso de colores, calles adoquinadas, arte en zócalos y el imponente Peñón de Guatape",4f,"Sencillo",R.drawable.fotositios333));
        listaSitiosTuristicos.add(new MoldeSitiosTuristicos("Tour Natural","Lina Maria Rios ","3104587312","$100.000 - 500.000", R.drawable.fotositiost4,"Guatapé, Colombia: Naturaleza deslumbrante, cultura vibrante y vistas panorámicas desde la emblemática Piedra del Peñol.",4f,"Unico",R.drawable.fotositios444));
        listaSitiosTuristicos.add(new MoldeSitiosTuristicos("Tour Nativo","Lina Maria Rios ","3054587871","$90.000 - 180.000", R.drawable.fotositiost5,"\"Guatapé, Colombia: Un encantador pueblo, arte en sus calles y la imponente Piedra del Peñol. Imperdible.",5f,"Lo podria repetir",R.drawable.fotositios555));

    }
}