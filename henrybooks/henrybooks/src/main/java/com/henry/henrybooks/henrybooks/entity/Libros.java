package com.henry.henrybooks.henrybooks.entity;

public class Libros {
    //atributos
    private Long idLibros;
    private String nombre;
    private String editorial;
    private String imagen;
    private String genero;
    private int stock;
    private double precio;
    private boolean estado;
    //constructor

    public Libros() {
    }

    public Libros(Long idLibros, String nombre, String editorial, String imagen, String genero, int stock, double precio) {
        this.idLibros = idLibros;
        this.nombre = nombre;
        this.editorial = editorial;
        this.imagen = imagen;
        this.genero = genero;
        this.stock = stock;
        this.precio = precio;
        this.estado = true;
    }
    //metodos


    //getter y setters mas toString


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
                '}';
    }


}
