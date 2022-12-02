package com.pillines.petpedia.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.pillines.petpedia.model.Canales;
import com.pillines.petpedia.repository.CanalesRepository;

@Service
@Transactional
public class CanalesService {
    
    private CanalesRepository canalesRepository;

    public CanalesService(CanalesRepository canalesRepository){
        this.canalesRepository = canalesRepository;
    }

    public List<Canales> getAll(){
        return (List<Canales>) canalesRepository.findAll();
    }

}
