package com.example.pillines.petpedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pillines.petpedia.model.Provincia;
import com.example.pillines.petpedia.service.ProvinciaService;

@RestController
@CrossOrigin("*")
public class ProvinciaController {

    private ProvinciaService provinciaService;

    public ProvinciaController(@Autowired ProvinciaService provinciaService){
        this.provinciaService = provinciaService;
    }

    @GetMapping("/Provincia/getAll")
    public List<Provincia> findAll(){
        return provinciaService.findAll2();
    }
}
