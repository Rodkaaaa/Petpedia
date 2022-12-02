package com.pillines.petpedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pillines.petpedia.model.Canales;
import com.pillines.petpedia.service.CanalesService;

@RestController
@CrossOrigin("*")
public class CanalesController {
    
    private CanalesService canalesService;

    public CanalesController(@Autowired CanalesService canalesService){
        this.canalesService = canalesService;
    }

    @GetMapping("/canales/getAll")
    public List<Canales> getAll(){
        return canalesService.getAll();
    }
}
