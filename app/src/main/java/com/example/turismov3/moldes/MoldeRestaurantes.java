package com.example.turismov3.moldes;

import java.io.Serializable;

public class MoldeRestaurantes implements Serializable {

    private String nombre;
    private Integer foto;
    private String telefono;
    private String rangoprecio;
    private String platorecomendado;
    private String resena;
    private float calificacion;
    private String comentario;
    private Integer fotoadicional;

    public MoldeRestaurantes() { //constructor vacio
    }

    public MoldeRestaurantes(String nombre, Integer foto, String telefono, String rangoprecio, String platorecomendado, String resena, float calificacion, String comentario, Integer fotoadicional) {
        this.nombre = nombre;
        this.foto = foto;
        this.telefono = telefono;
        this.rangoprecio = rangoprecio;
        this.platorecomendado = platorecomendado;
        this.resena = resena;
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fotoadicional = fotoadicional;
    }
// constructor lleno


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRangoprecio() {
        return rangoprecio;
    }

    public void setRangoprecio(String rangoprecio) {
        this.rangoprecio = rangoprecio;
    }

    public String getPlatorecomendado() {
        return platorecomendado;
    }

    public void setPlatorecomendado(String platorecomendado) {
        this.platorecomendado = platorecomendado;
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




