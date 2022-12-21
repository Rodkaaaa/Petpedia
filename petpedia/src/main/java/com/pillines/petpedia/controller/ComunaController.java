package com.pillines.petpedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pillines.petpedia.model.Comuna;
import com.pillines.petpedia.service.ComunaService;

@RestController
@CrossOrigin("*")
public class ComunaController {

    private ComunaService comunaService;

    public ComunaController(@Autowired ComunaService comunaService) {
        this.comunaService = comunaService;
    }

    @GetMapping("/comuna/getAll")
    public List<Comuna> getAll() {
        return comunaService.getAll();
    }

    @PostMapping("/comuna/save")
    public void saveComuna(@RequestBody Comuna comuna) {
        comunaService.saveComuna(comuna);
    }
}