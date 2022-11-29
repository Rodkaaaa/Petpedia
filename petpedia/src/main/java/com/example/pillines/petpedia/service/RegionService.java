package com.example.pillines.petpedia.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.pillines.petpedia.model.Region;
import com.example.pillines.petpedia.repository.RegionRepository;

@Service
public class RegionService {

    private RegionRepository regionRepository;

    private RegionService(RegionRepository regionRepository){
        this.regionRepository = regionRepository;
    }

    public List<Region> findAll(){
        return (List<Region>)regionRepository.findAll();
    }

    public List<Region> findAll2(){
        return (List<Region>)regionRepository.findAllRegions();
    }

}
