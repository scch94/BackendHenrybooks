package com.henry.henrybooks.henrybooks.entity;

public class Autor {
    //atributos
    private Long idAutor;
    private String nombre;
    private boolean estado;
    //constructor
    public Autor(Long idAutor, String nombre) {
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.estado=true;
    }

    public Autor() {
    }
    //metodos

    //getters y setters

    public Long getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Long idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "idAutor=" + idAutor +
                ", nombre='" + nombre + '\'' +
                ", estado=" + estado +
                '}';
    }
}
