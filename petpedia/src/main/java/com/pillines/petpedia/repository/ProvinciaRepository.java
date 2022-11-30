package com.pillines.petpedia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pillines.petpedia.model.Provincia;

public interface ProvinciaRepository extends JpaRepository<Provincia, Integer> {
    // Query's
    @Query(value = "SELECT * FROM provincia WHERE nombre_provincia = ?1", nativeQuery = true)
    List<Provincia> findAllNombreProvincia(String nombreProvincia);

    @Query(value = "SELECT * FROM provincia", nativeQuery = true)
    List<Provincia> findAllProvincias();

}