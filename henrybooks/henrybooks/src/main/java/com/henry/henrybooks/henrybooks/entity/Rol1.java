package com.henry.henrybooks.henrybooks.entity;

public class Rol1 {
    //atributos
    private long idRol;
    private String descripcion;
    private boolean estado;
    //constructor

    public Rol1(){
    }

    public Rol1(long idRol, String descripcion, boolean estado) {
        this.idRol = idRol;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    //metodos

    //getters y setters
    public long getIdRol() {
        return idRol;
    }

    public void setIdRol(long idRol) {
        this.idRol = idRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "idRol=" + idRol +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                '}';
    }
}
