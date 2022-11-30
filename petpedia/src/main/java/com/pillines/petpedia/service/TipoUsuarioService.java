package com.pillines.petpedia.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pillines.petpedia.model.TipoUsuario;
import com.pillines.petpedia.repository.TipoUsuarioRepository;

@Service
@Transactional
public class TipoUsuarioService {
    
    private TipoUsuarioRepository tipoUsuarioRepository;

    public TipoUsuarioService(TipoUsuarioRepository tipoUsuarioRepository){
        this.tipoUsuarioRepository = tipoUsuarioRepository;
    }

    public List<TipoUsuario> findAll(){
        return (List<TipoUsuario>)tipoUsuarioRepository.findAll();
    }

    public List<TipoUsuario> findAll2(){
        return (List<TipoUsuario>)tipoUsuarioRepository.findAllTipoUsuario();
    }

    public void saveTipoUsuario(TipoUsuario tipoUsuario){
        tipoUsuarioRepository.save(tipoUsuario);
    }
}
