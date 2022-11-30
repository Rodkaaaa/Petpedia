package com.pillines.petpedia.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pillines.petpedia.model.Canales;


public interface CanalesRepository extends JpaRepository<Canales, Integer> {
    //Query's
    @Query(value = "SELECT * FROM canales WHERE nombre_canal = ?1", nativeQuery = true)
    List<Canales> findAllNombreCanales(String nombreCanal);

    @Query(value= "SELECT * FROM canales WHERE siglas = ?1", nativeQuery = true)
    List<Canales> findAllCanalesSiglas(String siglas);

    @Query(value = "SELECT * FROM canales where nombre_canal = ?1 AND siglas = ?2", nativeQuery = true)
    List<Canales> findAllCanalesSiglas(String nombreCanal, String siglas);

    @Query(value = "SELECT * FROM canales c JOIN c.usuario us", nativeQuery = true)
    List<Canales> buscarCanalesUsuario();
}