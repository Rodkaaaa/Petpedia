package com.pillines.petpedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pillines.petpedia.model.Provincia;
import com.pillines.petpedia.service.ProvinciaService;

@RestController
@CrossOrigin("*")
public class ProvinciaController {

    private ProvinciaService provinciaService;

    public ProvinciaController(@Autowired ProvinciaService provinciaService) {
        this.provinciaService = provinciaService;
    }

    @PostMapping("/provincia/save")
    public void saveProvincia(@RequestBody Provincia provincia) {
        provinciaService.saveProvincia(provincia);
    }

    @PutMapping("/provincia/update")
    public void updateProvincia(@RequestBody Provincia provincia) {
        provinciaService.saveProvincia(provincia);
    }

    @PostMapping("/provincia/delete/{id}")
    public void saveProvincia(@PathVariable("id") Integer id) {
        provinciaService.deleteProvincia(id);
    }

    @GetMapping("/provincia/getAll")
    public List<Provincia> findAll() {
        return provinciaService.findAll();
    }

    @PostMapping("/provincia/saveAll")
    public void saveAllProvincia(@RequestBody List<Provincia> provincia) {
        provinciaService.saveAllProvincia(provincia);
    }
}
