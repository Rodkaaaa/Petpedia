package com.pillines.petpedia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pillines.petpedia.model.Region;

public interface RegionRepository extends JpaRepository<Region, Integer> {
    // Query's
    @Query(value = "SELECT * FROM region WHERE nombre_region = ?1", nativeQuery = true)
    List<Region> findAllNombreRegion(String nombreRegion);

    @Query(value = "SELECT * FROM region WHERE ordinal = ?1", nativeQuery = true)
    List<Region> findAllOrdinales(String ordinal);

    @Query(value = "SELECT * FROM region where nombre_region = ?1 AND ordinal = ?2", nativeQuery = true)
    List<Region> findAllRegionOrdinal(String nombreRegion, String ordinal);

    @Query(value = "SELECT * FROM region r JOIN r.provincia pr", nativeQuery = true)
    List<Region> buscarRegionProvincia();

    @Query(value = "SELECT * FROM region", nativeQuery = true)
    List<Region> findAllRegions();

}