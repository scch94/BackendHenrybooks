package com.henry.henrybooks.henrybooks.service;

import com.henry.henrybooks.henrybooks.entities.Resena;

import java.util.List;

public interface IResenaService {
    public Resena findById(long id);

    public List<Resena> findAll();

    public Resena createResena(Resena resena);

    public Resena updateResena(Long id,Resena resena);

    public String deleteResena(long id);
}
