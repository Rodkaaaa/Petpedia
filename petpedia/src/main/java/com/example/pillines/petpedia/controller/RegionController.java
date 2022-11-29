package com.example.pillines.petpedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pillines.petpedia.model.Region;
import com.example.pillines.petpedia.service.RegionService;

@RestController
@CrossOrigin("*")
public class RegionController {

    private RegionService regionService;

    public RegionController(@Autowired RegionService regionService){
        this.regionService = regionService;
    }

    @GetMapping("/getAll/")
    public List<Region> findAll(){
        return regionService.findAll2();
    }
}
