package com.pillines.petpedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pillines.petpedia.model.TipoUsuario;
import com.pillines.petpedia.service.TipoUsuarioService;

@RestController
@CrossOrigin("*")
public class TipoUsuarioController {

    private TipoUsuarioService tipoUsuarioService;

    public TipoUsuarioController(@Autowired TipoUsuarioService tipoUsuarioService) {
        this.tipoUsuarioService = tipoUsuarioService;
    }

    @GetMapping("/tipoUsuario/getAll/")
    public List<TipoUsuario> findAll() {
        return tipoUsuarioService.findAll();
    }

    @PostMapping("/tipoUsuario/save/")
    public void saveTipoUsuario(@RequestBody TipoUsuario tipoUsuario) {
        tipoUsuarioService.saveTipoUsuario(tipoUsuario);
    }

}
