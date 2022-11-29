package com.example.pillines.petpedia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;

import com.example.pillines.petpedia.model.Comuna;

public interface ComunaRepository extends CrudRepository<Comuna,Integer>{
    
    @Query(value = "SELECT * FROM comuna WHERE nombre_comuna = ?1", nativeQuery = true)
    List<Comuna> findAllNombreComunas(String nombreComuna);
    
    @Query(value = "SELECT * FROM comuna", nativeQuery = true)
    List<Comuna> findAllComunas();
    

}