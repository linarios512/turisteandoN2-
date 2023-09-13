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
        listarestaurantes.add(new MoldeRestaurantes("Restaurante Oregano",R.drawable.fotorestaurante1,"3112563245","$60.000 - 100.000","Filet Mignon", "Restaurante Oregano en Guatape: la deliciosa cocina colombiana, las vistas panoramicas al lago y la calida hospitalidad lo convierten en una visita obligada", 5f,"excelente comida",R.drawable.fotorestaurante111));
        listarestaurantes.add(new MoldeRestaurantes("Restaurante Flor de Lis",R.drawable.fotorestaurante2,"3202563245","$50.000 - 100.000","Pargo Rojo", "Este restaurante ofrece platos exquisitos, servicio impecable y un ambiente encantador. Una experiencia gastronómica inolvidable.", 5f,"atencion unica",R.drawable.fotorestaurante222));
        listarestaurantes.add(new MoldeRestaurantes("Restaurante Parisino",R.drawable.fotorestaurante3,"3182563245","$70.000 - 90.000","Camarones a la Parmesana", "Un rincón culinario excepcional con sabores únicos, ambiente acogedor y un servicio que supera expectativas. Deliciosamente memorable.", 5f,"podria ser mejor",R.drawable.fotorestaurante333));
        listarestaurantes.add(new MoldeRestaurantes("Restaurante Rincon del Steak",R.drawable.fotorestaurante4,"3222563245","$60.000 - 90.000","Cazuela de frijoles", "Este restaurante deleita con su cocina creativa, ingredientes frescos y un ambiente acogedor que invita a quedarse.", 5f,"sabor inigualable",R.drawable.fotorestaurante444));
        listarestaurantes.add(new MoldeRestaurantes("Restaurante Tikka",R.drawable.fotorestaurante5,"3212563245","$100.000 - 120.000","Trucha al ajillo", "\"Una experiencia culinaria excepcional, donde la pasión por la comida se combina con una atención impecable.", 5f,"autenticidad",R.drawable.fotorestaurante555));

    }

}