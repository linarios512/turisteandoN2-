package com.example.turismov3.moldes;

import java.io.Serializable;

public class MoldeSitiosTuristicos implements Serializable {

    private String nombre;//atributos de la clase
    private String Nombrecontacto;
    private String telefono;
    private String precio;
    private Integer foto;
    private String resena;
    private float calificacion;
    private String comentario;
    private Integer fotoadicional;



    public MoldeSitiosTuristicos() {  //constructor vacio: sirven para sacar copias a los valores
    }

    public MoldeSitiosTuristicos(String nombre, String nombrecontacto, String telefono, String precio, Integer foto, String resena, float calificacion, String comentario, Integer fotoadicional) {
        this.nombre = nombre;
        Nombrecontacto = nombrecontacto;
        this.telefono = telefono;
        this.precio = precio;
        this.foto = foto;
        this.resena = resena;
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fotoadicional = fotoadicional;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrecontacto() {
        return Nombrecontacto;
    }

    public void setNombrecontacto(String nombrecontacto) {
        Nombrecontacto = nombrecontacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public String getResena() {
        return resena;
    }

    public void setResena(String resena) {
        this.resena = resena;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getFotoadicional() {
        return fotoadicional;
    }

    public void setFotoadicional(Integer fotoadicional) {
        this.fotoadicional = fotoadicional;
    }
}


//molde grafico: tiene elementos que varian dependeindo del mlode que quiero, cada uno tiene elementos que voy a cambiar
//en el molde logico se definen unos aTRIBUTOS : son cada uno de los elementos que en el molde grafico cambian



//iniciamos hacindo el molde:
//la lista cambia, loe elementos cambian
//diferencia: informacion privada .....con set escribo y get la leo!
