package com.pillines.petpedia.repository;

import org.springframework.data.repository.CrudRepository;

import com.pillines.petpedia.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
    
}
