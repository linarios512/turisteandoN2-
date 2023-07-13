package com.example.turismov3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    //ATRIBUTOS DE LA CLASE
    EditText cajaNombreUsuario;
    EditText cajaContrasenaUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        cajaNombreUsuario=findViewById(R.id.usuario);
        cajaContrasenaUsuario=findViewById(R.id.contraseña);

        //capturando datos de las cajas (Edittext)
        String nombreUsuario=cajaNombreUsuario.getText().toString();
        String contrasena=cajaContrasenaUsuario.getText().toString();

    }
}