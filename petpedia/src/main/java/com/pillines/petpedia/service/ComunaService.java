package com.pillines.petpedia.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.pillines.petpedia.model.Comuna;
import com.pillines.petpedia.repository.ComunaRepository;

@Service
@Transactional
public class ComunaService {

    private ComunaRepository comunaRepository;

    public ComunaService(ComunaRepository comunaRepository) {
        this.comunaRepository = comunaRepository;
    }

    // CRUD
    public void saveComuna(Comuna comuna) {
        comunaRepository.save(comuna);
    }

    public List<Comuna> getAll() {
        return (List<Comuna>) comunaRepository.findAll();
    }
}
