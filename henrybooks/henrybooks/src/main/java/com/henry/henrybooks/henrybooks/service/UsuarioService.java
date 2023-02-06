package com.henry.henrybooks.henrybooks.service;

import com.henry.henrybooks.henrybooks.entity.Rol;
import com.henry.henrybooks.henrybooks.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService{


    @Override
    public Usuario findById(long id) {
        Rol rol=Rol.user;
        Usuario usuario=new Usuario(id,"santiago","santycanal_06@hotmail.com","Lolnoob1994.",rol,true);
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
    public String updateUser(long id) {
        return null;
    }
}
