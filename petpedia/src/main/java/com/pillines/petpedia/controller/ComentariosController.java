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

import com.pillines.petpedia.model.Comentarios;
import com.pillines.petpedia.service.ComentariosService;

@RestController
@CrossOrigin("*")
public class ComentariosController {


    private ComentariosService comentariosService;

    public ComentariosController(@Autowired ComentariosService comentariosService) {
        this.comentariosService = comentariosService;
    }
    @GetMapping(("comentarios/getAll/"))
    public List<Comentarios> findAll() {
        return comentariosService.findAll();
    }
    @PostMapping("comentarios/save/")
    public void saveComentarios(@RequestBody Comentarios comentarios) {
        comentariosService.saveComentarios(comentarios);
    }
    @PutMapping("comentarios/update/")
    public void updateComentarios(@RequestBody Comentarios comentarios) {
        comentariosService.updateComentarios(comentarios);
    }
    @DeleteMapping("comentarios/delete/{id}")
    public void deleteComentarios(@PathVariable("id") Integer id) {
        comentariosService.deleteComentarios(id);
    }


}

