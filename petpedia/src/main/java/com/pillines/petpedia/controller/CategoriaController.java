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

import com.pillines.petpedia.model.Categoria;
import com.pillines.petpedia.service.CategoriaService;

@RestController
@CrossOrigin("*")
public class CategoriaController {

    private CategoriaService categoriaService;

    public CategoriaController(@Autowired CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping("/categoria/save")
    public void saveCategoria(@RequestBody Categoria categoria) {
        categoriaService.saveCategoria(categoria);
    }

    @PutMapping("/categoria/update")
    public void updateProvincia(@RequestBody Categoria categoria) {
        categoriaService.saveCategoria(categoria);
    }

    @PostMapping("/categoria/delete/{id}")
    public void saveProvincia(@PathVariable("id") Integer id) {
        categoriaService.deleteCategoria(id);
    }

    @GetMapping("/categoria/getAll")
    public List<Categoria> findAll() {
        return categoriaService.findAll();
    }
}