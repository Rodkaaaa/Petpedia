package com.pillines.petpedia.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.pillines.petpedia.model.Usuario;
import com.pillines.petpedia.repository.UsuarioRepository;

@Service
@Transactional
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // CRUD
    public void saveUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public void updateUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public void deleteUsuario(Integer id) {
        usuarioRepository.deleteById(id);
    }

    public List<Usuario> getAllUsuario() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

}
