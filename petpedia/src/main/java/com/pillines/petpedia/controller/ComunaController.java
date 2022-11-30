package com.pillines.petpedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.pillines.petpedia.model.Comuna;
import com.pillines.petpedia.service.ComunaService;

@RestController
@CrossOrigin("*")
public class ComunaController {
    
    private ComunaService comunaService;

    public ComunaController(@Autowired ComunaService comunaService){
        this.comunaService = comunaService;
    }

    public void saveComuna(Comuna comuna){
        comunaService.saveComuna(comuna);
    }
}
