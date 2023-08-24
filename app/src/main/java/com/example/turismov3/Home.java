package com.example.turismov3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class Home extends AppCompatActivity {

    //ATRIBUTOS
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonSitios;

    TextView nombreCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String nombre=getIntent().getStringExtra("nombre");

        botonHoteles=findViewById(R.id.botonhoteles);
        botonRestaurantes=findViewById(R.id.botonrestaurantes);
        botonSitios=findViewById(R.id.botonsitios);
        nombreCliente=findViewById(R.id.botoncliente);

        //Uniendo el texto del PUTEXTRA con el TEXTVIEW
        nombreCliente.setText(nombre);

        // DETECTANDO EVENTOS

        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intentHoteles=new Intent(Home.this,HotelesHome.class);
            startActivity(intentHoteles);
            }
        });

        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,RestaurantesHome.class);
                startActivity(intent);
            }
        });

        botonSitios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this, TurismoHome.class);
                startActivity(intent);
            }
        });

    }


    public void cambiarIdioma(String idioma){

    //CONFIGURAR EL LENGUJE DEL TELEFONO

    Locale lenguaje=new Locale(idioma);
    Locale.setDefault(lenguaje);

    //configuramos globalmente el telefono

    Configuration configuracionTelefono=getResources().getConfiguration();
        configuracionTelefono.locale=lenguaje;

        //ejecutamos la configuracion

        getBaseContext().getResources().updateConfiguration(configuracionTelefono,getBaseContext().getResources().getDisplayMetrics());

    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        int itemSeleccionado=item.getItemId();
        switch (itemSeleccionado){
            case(R.id.opcion1):
                this.cambiarIdioma("en");
                Intent intentIngles=new Intent(Home.this,Home.class);
                startActivity(intentIngles);

                break;
            case (R.id.opcion2):
                this.cambiarIdioma("es");
                Intent intentEspanol=new Intent(Home.this,Home.class);
                startActivity(intentEspanol);
                break;

            case (R.id.opcion3):
                this.cambiarIdioma("it");
                Intent intentItaliano=new Intent(Home.this,Home.class);
                startActivity(intentItaliano);
                break;

            case (R.id.opcion4):
                Intent intent = new Intent(Home.this,Acerca.class);
                startActivity(intent);
                break;

        }

        return super.onOptionsItemSelected(item);
    }


    }

