package com.henry.henrybooks.henrybooks.entities;



import javax.persistence.*;

@Entity
@Table(name="Autores")
public class Autor {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_autor",nullable = false)//nullable=true acepta valores unicos
    private Long idAutor;
    @Column(name = "nombre",nullable = false,unique = true)
    private String nombre;
    @Column(name = "estado")
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
