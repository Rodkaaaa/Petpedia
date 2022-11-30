package com.pillines.petpedia.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pillines.petpedia.model.Provincia;
import com.pillines.petpedia.repository.ProvinciaRepository;

@Service
@Transactional
public class ProvinciaService {

    private ProvinciaRepository provinciaRepository;

    public ProvinciaService(ProvinciaRepository provinciaRepository) {
        this.provinciaRepository = provinciaRepository;
    }

    // CRUD
    public List<Provincia> findAll() {
        return (List<Provincia>) provinciaRepository.findAll();
    }

    public List<Provincia> findAll2() {
        return (List<Provincia>) provinciaRepository.findAllProvincias();
    }

    public void saveProvincia(Provincia provincia) {
        provinciaRepository.save(provincia);
    }

    public void updateProvincia(Provincia provincia) {
        provinciaRepository.save(provincia);
    }

    public void deleteProvincia(Integer id) {
        provinciaRepository.deleteById(id);
    }

    public void saveAllProvincia(List<Provincia> provincia) {
        provinciaRepository.saveAll(provincia);
    }

}
