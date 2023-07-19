package com.example.turismov3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    //ATRIBUTOS DE LA CLASE
    EditText cajaNombreUsuario;
    EditText cajaContrasenaUsuario;

    Button botoningreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        cajaNombreUsuario=findViewById(R.id.usuario);
        cajaContrasenaUsuario=findViewById(R.id.contraseña);
        botoningreso=findViewById(R.id.botoningreso);

        botoningreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//capturando datos de las cajas (Edittext)
                String nombreUsuario=cajaNombreUsuario.getText().toString();
                String contrasena=cajaContrasenaUsuario.getText().toString();

        //abrimos una nueva actividad (HOME)

                Intent intent=new Intent(Login.this,Home.class);

                //pasando datos ala nueva actividad

                intent.putExtra("nombre",nombreUsuario);
                intent.putExtra("password",contrasena);

                startActivity(intent);
            }
        });



    }
}