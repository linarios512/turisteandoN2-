package com.example.turismov3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.turismov3.adaptadores.AdaptadorHoteles;
import com.example.turismov3.moldes.MoldeHotel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    ArrayList<MoldeHotel> listaHoteles=new ArrayList<>();
    RecyclerView recyclerView;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView=findViewById(R.id.listadinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        db.collection("users")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {

                               String nombreHotel=document.getString("nombre");
                               String precioHotel=document.getString("precio");
                               String telefonoHotel=document.getString("telefono");
                               String descripcionHotel=document.getString("descripcion");

                               Toast.makeText(ListaHoteles.this, nombreHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaHoteles.this, precioHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaHoteles.this, telefonoHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaHoteles.this, descripcionHotel, Toast.LENGTH_SHORT).show();

                            }
                        } else {
                          //  Log.w(TAG, "Error getting documents.", task.getException());
                        }
                    }
                });

        llenarListaConDatos();
        AdaptadorHoteles adaptadorHoteles=new AdaptadorHoteles(listaHoteles);
        recyclerView.setAdapter(adaptadorHoteles);
    }
    public void llenarListaConDatos(){
        listaHoteles.add(new MoldeHotel("Hotel Glamping Guatapé","$200.000 - 250.000", "3225605856",R.drawable.fotohotel1,"Hotel Glamping en Guatapé:  Encanto campestre, lujo natural, escapada perfecta.  Naturaleza y comodidad en armonía" , 5f, "Agradable y central", R.drawable.fotohotel111));
        listaHoteles.add(new MoldeHotel("Hotel Guatapé express","$150.000 - 200.000", "3105605835",R.drawable.fotohotel2,"Este hotel ofrece comodidad inigualable, vistas espectaculares y un servicio excepcional. Un refugio perfecto para relajarse.", 5f, "Excelente atención", R.drawable.fotohotel222));
        listaHoteles.add(new MoldeHotel("Hotel La Piedra","$200.000 - 300.000", "3205605878",R.drawable.fotohotel3,"El hotel brilla con lujo, gastronomía exquisita y atención impecable. Un destino inolvidable para viajeros exigentes.", 5f, "Buen servicio", R.drawable.fotohotel333));
        listaHoteles.add(new MoldeHotel("Hotel La Mansión","$300.000 - 400.000", "3155605832",R.drawable.fotohotel4,"Un acogedor hotel que combina encanto histórico con comodidades modernas, garantizando una estancia memorable y relajante.", 5f, "Hotel tranquilo", R.drawable.fotohotel444));
        listaHoteles.add(new MoldeHotel("Hotel La Fontana","$170.000 - 230.000", "3165605819",R.drawable.fotohotel5,"Este hotel es un oasis de lujo y tranquilidad, donde el confort y la elegancia se fusionan perfectamente.", 5f, "Hotel silencioso", R.drawable.fotohotel555));
    }

}
