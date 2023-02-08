package com.henry.henrybooks.henrybooks.entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Libros")
public class Libros {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_libros")
    private Long idLibros;
    @Column(name="nombre",nullable = false)
    private String nombre;
    @Column(name = "editorial")
    private String editorial;
    @Column(name="imagen")
    private String imagen;
    @Column(name="genero")
    private String genero;
    @Column(name ="stock")
    private int stock;
    @Column(name = "precio")
    private double precio;
    @Column(name="estado")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="id_autor")
    private Autor autor;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="Usuarios_Libros",
        joinColumns = @JoinColumn(name="Libro_id",referencedColumnName ="id_libros"),
        inverseJoinColumns = @JoinColumn(name = "Usuario_id",referencedColumnName = "id_usuario"))
    private List<Usuario> usuarios;

    //constructor

    public Libros() {
    }

    public Libros(Long idLibros, String nombre, String editorial, String imagen, String genero, int stock, double precio,Autor autor) {
        this.idLibros = idLibros;
        this.nombre = nombre;
        this.editorial = editorial;
        this.imagen = imagen;
        this.genero = genero;
        this.stock = stock;
        this.precio = precio;
        this.estado = true;
        this.autor=autor;
        this.usuarios=new ArrayList<Usuario>();
    }
    //metodos


    //getter y setters mas toString


    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Long getIdLibros() {
        return idLibros;
    }

    public void setIdLibros(Long idLibros) {
        this.idLibros = idLibros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "Libros{" +
                "idLibros=" + idLibros +
                ", nombre='" + nombre + '\'' +
                ", editorial='" + editorial + '\'' +
                ", imagen='" + imagen + '\'' +
                ", genero='" + genero + '\'' +
                ", stock=" + stock +
                ", precio=" + precio +
                ", estado=" + estado +
                ", autor=" + autor +
                ", usuarios=" + usuarios +
                '}';
    }
}
