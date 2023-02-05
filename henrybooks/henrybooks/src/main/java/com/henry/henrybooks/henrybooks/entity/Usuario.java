package com.henry.henrybooks.henrybooks.entity;

public class Usuario {
    //atributos
    private Long idUsuario;
    private String nombre;
    private String email;
    private String clave;
    private Rol rol;
    private boolean estado;
    //constructors
    public Usuario() {
    }

    public Usuario(Long idUsuario, String nombre, String email, String clave, Rol rol, boolean estado) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.clave = clave;
        this.rol = rol;
        this.estado = estado;
    }
    //metodos


    //getter y setters
    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", clave='" + clave + '\'' +
                ", rol=" + rol +
                ", estado=" + estado +
                '}';
    }
}
