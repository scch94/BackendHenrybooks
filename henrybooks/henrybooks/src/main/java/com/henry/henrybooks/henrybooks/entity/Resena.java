package com.henry.henrybooks.henrybooks.entity;

public class Resena {
    //atributos
    private Long idResena;
    private String titulo;
    private String descripcion;
    private int calificacion;
    private int denuncias;
    private boolean estado;
    //metodos

    //constructor

    public Resena() {
    }

    public Resena(Long idResena, String titulo, String descripcion,int calificacion) {
        this.idResena = idResena;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.calificacion=calificacion;
        this.denuncias=0;
        this.estado=true;
    }
    //getterandsetters

    public Long getIdResena() {
        return idResena;
    }

    public void setIdResena(Long idResena) {
        this.idResena = idResena;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getDenuncias() {
        return denuncias;
    }

    public void setDenuncias(int denuncias) {
        this.denuncias = denuncias;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Resena{" +
                "idResena=" + idResena +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", calificacion=" + calificacion +
                ", denuncias=" + denuncias +
                ", estado=" + estado +
                '}';
    }
}
