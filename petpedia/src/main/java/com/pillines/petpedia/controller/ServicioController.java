package com.pillines.petpedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pillines.petpedia.model.Servicio;
import com.pillines.petpedia.service.ServicioService;

@RestController
@CrossOrigin("*")
public class ServicioController {

    private ServicioService servicioService;

    public ServicioController(@Autowired ServicioService servicioService) {
        this.servicioService = servicioService;
    }

    @GetMapping("/servicio/getAll/")
    public List<Servicio> findAll() {
        return servicioService.findAll();
    }

    @PutMapping("/servicio/update")
    public void updateServicio(@RequestBody Servicio servicio) {
        servicioService.updateServicio(servicio);
    }

    @DeleteMapping("/servicio/delete/{id}")
    public void deleteServicio(@PathVariable("id") Integer id) {
        servicioService.deleteServicio(id);
    }

    @PostMapping("/servicio/save")
    public void saveServicio(@RequestBody Servicio servicio) {
        servicioService.saveServicio(servicio);
    }
}
