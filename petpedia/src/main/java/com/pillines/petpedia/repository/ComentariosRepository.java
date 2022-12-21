package com.pillines.petpedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pillines.petpedia.model.Comentarios;

@Repository
public interface ComentariosRepository extends JpaRepository<Comentarios,Integer> {
    
}
