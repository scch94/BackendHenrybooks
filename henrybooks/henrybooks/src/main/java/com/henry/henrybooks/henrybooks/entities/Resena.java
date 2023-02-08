package com.henry.henrybooks.henrybooks.entities;

import javax.persistence.*;

@Entity
@Table(name="Resenas")
public class Resena {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_resena",nullable = false)
    private Long idResena;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "calificacion")
    private int calificacion;
    @Column(name = "denuncias")
    private int denuncias;
    @Column(name = "estado")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name="id_libro")
    private Libros libro;
    //metodos

    //constructor

    public Resena() {
    }

    public Resena(Long idResena, String titulo, String descripcion, int calificacion, int denuncias, Usuario usuario, Libros libro) {
        this.idResena = idResena;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
        this.denuncias = denuncias;
        this.usuario = usuario;
        this.libro = libro;
        this.estado=true;
    }

    //getterandsetters

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libros getLibro() {
        return libro;
    }

    public void setLibro(Libros libro) {
        this.libro = libro;
    }

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
                ", usuario=" + usuario +
                ", libro=" + libro +
                '}';
    }
}
