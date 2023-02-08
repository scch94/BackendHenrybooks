package com.henry.henrybooks.henrybooks.service;

import com.henry.henrybooks.henrybooks.entities.Rol;
import com.henry.henrybooks.henrybooks.entities.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService{


    @Override
    public Usuario findById(long id) {
        Rol rol=Rol.user;
        Usuario usuario=new Usuario(id,"santiago","santycanal_06@hotmail.com","Lolnoob1994.",rol);
        return usuario;
    }

    @Override
    public List<Usuario> findAll() {
        return null;
    }

    @Override
    public Usuario createUser(Usuario usuario) {
        return null;
    }

    @Override
    public Usuario updateUser(Long id, Usuario usuario) {
        return null;
    }

    @Override
    public String deleteUser(long id) {
        return null;
    }
}
