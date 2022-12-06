package com.pillines.petpedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pillines.petpedia.model.Comentarios;

public interface ComentariosRepository extends JpaRepository<Comentarios,Integer> {
    
}
