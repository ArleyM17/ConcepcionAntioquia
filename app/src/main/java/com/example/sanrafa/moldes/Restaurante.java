package com.example.sanrafa.moldes;

import java.io.Serializable;

public class Restaurante implements Serializable {

    private String nombre;
    private String precio;
    private String Descripcion;
    private String telefono;
    private String direccion;
    private Integer calificacion;
    private Integer fotografia;

    public Restaurante() {
    }

    public Restaurante(String nombre, String precio, String descripcion, String telefono, String direccion, Integer calificacion, Integer fotografia) {
        this.nombre = nombre;
        this.precio = precio;
        Descripcion = descripcion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.calificacion = calificacion;
        this.fotografia = fotografia;
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

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public Integer getFotografia() {
        return fotografia;
    }

    public void setFotografia(Integer fotografia) {
        this.fotografia = fotografia;
    }
}
