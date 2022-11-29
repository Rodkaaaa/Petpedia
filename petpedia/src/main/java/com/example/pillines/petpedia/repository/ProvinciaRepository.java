package com.example.pillines.petpedia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;

import com.example.pillines.petpedia.model.Provincia;

public interface ProvinciaRepository extends CrudRepository<Provincia,Integer>{
    
    @Query(value = "SELECT * FROM provincia WHERE nombre_provincia = ?1", nativeQuery = true)
    List<Provincia> findAllNombreProvincia(String nombreProvincia);
    
    @Query(value = "SELECT * FROM provincia", nativeQuery = true)
    List<Provincia> findAllProvincias();
    

}