package com.henry.henrybooks.henrybooks.service;

import com.henry.henrybooks.henrybooks.entities.Libros;

import java.util.List;

public interface ILibrosService {
    public Libros findById(long id);

    public List<Libros> findAll();

    public Libros createLibro(Libros libro);

    public Libros updateLibro(Long id,Libros libro);

    public String deleteLibro(long id);
}
