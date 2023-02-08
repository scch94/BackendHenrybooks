package com.henry.henrybooks.henrybooks.controller;

import com.henry.henrybooks.henrybooks.entities.Usuario;
import com.henry.henrybooks.henrybooks.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UsuarioRestController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/{id}")
    public Usuario findById(@PathVariable long id){
        return usuarioService.findById(id);
    }
}
