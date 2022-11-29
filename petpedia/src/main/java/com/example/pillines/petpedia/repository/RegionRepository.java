package com.example.pillines.petpedia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.pillines.petpedia.model.Region;

public interface RegionRepository extends CrudRepository<Region,Integer>{
    @Query(value = "SELECT * FROM region", nativeQuery = true)
    List<Region> findAllRegions();
}