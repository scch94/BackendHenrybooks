package com.henry.henrybooks.henrybooks.service;

import com.henry.henrybooks.henrybooks.entities.Autor;

import java.util.List;

public interface IAutorService {
    public Autor findById(long id);

    public List<Autor> findAll();

    public Autor createAutor(Autor autor);

    public Autor updateAutor(Long id,Autor autor);

    public String deleteAutor(long id);
}
