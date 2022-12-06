package com.pillines.petpedia.service;

import java.util.List;

import com.pillines.petpedia.model.Comentarios;
import com.pillines.petpedia.repository.ComentariosRepository;

public class ComentariosService {
    
    private ComentariosRepository comentariosRepository;

    public ComentariosService(ComentariosRepository comentariosRepository){
        this.comentariosRepository = comentariosRepository;
    }


      // CRUD
    public List<Comentarios> findAll() {
        return comentariosRepository.findAll();
    }
    
    public void saveComentarios(Comentarios comentarios) {
        comentariosRepository.save(comentarios);
    }

    public void updateComentarios(Comentarios comentarios) {
        comentariosRepository.save(comentarios);
    }

    public void deleteComentarios(Integer id) {
        comentariosRepository.deleteById(id);
    }
}
