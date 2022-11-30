package com.pillines.petpedia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;

import com.pillines.petpedia.model.Servicio;

public interface ServicioRepository extends CrudRepository<Servicio, Integer> {
    // Query's
    @Query(value = "SELECT * FROM servicio WHERE tipo_servicio = ?1", nativeQuery = true)
    List<Servicio> findAllTipoServicio(String tipoServicio);

    @Query(value = "SELECT * FROM servicio WHERE descripcion = ?1", nativeQuery = true)
    List<Servicio> findAllDescripcionServicio(String descripcion);

    @Query(value = "SELECT * FROM servicio", nativeQuery = true)
    List<Servicio> findAllServicio();

}