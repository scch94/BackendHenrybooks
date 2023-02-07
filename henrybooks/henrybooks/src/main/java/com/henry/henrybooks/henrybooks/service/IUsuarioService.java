package com.henry.henrybooks.henrybooks.service;

import com.henry.henrybooks.henrybooks.entity.Usuario;

import java.util.List;

public interface IUsuarioService {

    public Usuario findById(long id);

    public List<Usuario> findAll();

    public Usuario createUser(Usuario usuario);

    public Usuario updateUser(Long id,Usuario usuario);

    public String deleteUser(long id);

}
