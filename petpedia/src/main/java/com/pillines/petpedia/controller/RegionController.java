package com.pillines.petpedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pillines.petpedia.model.Region;
import com.pillines.petpedia.service.RegionService;

@RestController
@CrossOrigin("*")
public class RegionController {

    private RegionService regionService;

    public RegionController(@Autowired RegionService regionService) {
        this.regionService = regionService;
    }

    @GetMapping("/region/getAll/")
    public List<Region> findAll() {
        return regionService.findAll2();
    }

    @PostMapping("/region/save")
    public void saveRegion(@RequestBody Region region) {
        regionService.saveRegion(region);
    }

    @PostMapping("/region/saveAll")
    public void saveAllRegion(@RequestBody List<Region> region) {
        regionService.saveAllRegion(region);
    }
}
