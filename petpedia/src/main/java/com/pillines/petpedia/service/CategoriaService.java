package com.pillines.petpedia.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.pillines.petpedia.model.Categoria;
import com.pillines.petpedia.repository.CategoriaRepository;

@Service
@Transactional
public class CategoriaService {

    private CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    // CRUD
    public List<Categoria> findAll() {
        return (List<Categoria>) categoriaRepository.findAll();
    }

    public void saveCategoria(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    public void updateCategoria(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    public void deleteCategoria(Integer id) {
        categoriaRepository.deleteById(id);
    }
}
