package com.henry.henrybooks.henrybooks.controller;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/rol")
public class RolRestController {
    /*
    @GetMapping("/{id}")
    public Rol findById(@PathVariable long id){
        Rol rol =new Rol(id,"user",true);
        return rol;
    }

    @GetMapping("/")
    public List<Rol> findAll(){
        List<Rol> roles = new ArrayList<Rol>();
        Rol rol1=new Rol(1,"admin",true);
        Rol rol2=new Rol(2,"user",true);
        roles.add(rol1);
        roles.add(rol2);
        return roles;
    }
    @PostMapping("/")
    public Rol createRol(@RequestBody Rol rol){
        Rol rol1 = new Rol();
        rol1.setIdRol(3);
        rol1.setDescripcion(rol.getDescripcion());
        rol1.setEstado(true);
        return rol1;
    }
    @PutMapping("/{id}")
    public Rol updateRol(@PathVariable Long id,@RequestBody Rol rol){
        Rol rol1 = findById(id);
        rol1.setDescripcion(rol.getDescripcion());
        rol1.setEstado(true);
        return rol1;
    }
    @PutMapping("/delete/{id}")
    public String updateRol(@PathVariable long id){
        Rol rol1 = findById(id);
        rol1.setEstado(false);
        String nombre="el usuari con id "+id+" fue eliminado";
        return nombre;
    }
*/


}
