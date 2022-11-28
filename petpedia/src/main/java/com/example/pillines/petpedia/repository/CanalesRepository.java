package com.example.pillines.petpedia.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.pillines.petpedia.model.Canales;


public interface CanalesRepository extends JpaRepository<Canales, Integer> {
    
    @Query(value = "SELECT * FROM canales WHERE marca = ?1", nativeQuery = true)
    List<Canales> findAllAutoMarca(String marca);

    @Query(value= "SELECT * FROM car WHERE color = ?1", nativeQuery = true)
    List<Canales> findAllAutoColor(String color);

    @Query(value = "SELECT * FROM car where color = ?1 AND marca = ?2", nativeQuery = true)
    List<Canales> findAllAutoColorMarca(String color, String marca);

    @Query(value = "SELECT * FROM car c JOIN c.carsell cs", nativeQuery = true)
    List<Canales> buscarAutosVendidos();
}