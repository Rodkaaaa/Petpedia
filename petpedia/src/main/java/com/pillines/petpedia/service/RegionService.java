package com.pillines.petpedia.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pillines.petpedia.model.Region;
import com.pillines.petpedia.repository.RegionRepository;

@Service
@Transactional
public class RegionService {

    private RegionRepository regionRepository;

    public RegionService(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    // CRUD
    public List<Region> findAll() {
        return (List<Region>) regionRepository.findAll();
    }

    public List<Region> findAll2() {
        return (List<Region>) regionRepository.findAllRegions();
    }

    public void saveRegion(Region region) {
        regionRepository.save(region);
    }

    public void saveAllRegion(List<Region> region) {
        regionRepository.saveAll(region);
    }

}
