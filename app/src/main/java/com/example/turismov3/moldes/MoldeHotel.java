package com.example.turismov3.moldes;

import java.io.Serializable;

public class MoldeHotel implements Serializable {

    private String nombre;
    private String precio;
    private String telefono;
    private Integer foto;
    private String resena;
    private float calificacion;
    private String comentario;
    private Integer fotoadicional;

    public MoldeHotel() {
        //constructor vacio
    }

    public MoldeHotel(String nombre, String precio, String telefono, Integer foto, String resena, float calificacion, String comentario, Integer fotoadicional) {
        this.nombre = nombre;
        this.precio = precio;
        this.telefono = telefono;
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

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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





//xml ampliando ..... a crear el text view okkkkkkkkkkk
//crear valoracion y comentario como text view  okkkkkkkkkkkkk
//.molde hotel y creamos los dos privados , borrar constructor
//crear get a set
//lista dinamica, poner mas datos.
//ampliando logico,