package com.example.pillines.petpedia.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.pillines.petpedia.model.Provincia;
import com.example.pillines.petpedia.repository.ProvinciaRepository;

@Service
public class ProvinciaService {

    private ProvinciaRepository provinciaRepository;

    private ProvinciaService(ProvinciaRepository provinciaRepository){
        this.provinciaRepository = provinciaRepository;
    }

    public List<Provincia> findAll(){
        return (List<Provincia>)provinciaRepository.findAll();
    }

    public List<Provincia> findAll2(){
        return (List<Provincia>)provinciaRepository.findAllProvincias();
    }

    public void saveProvincia(Provincia provincia){
        provinciaRepository.save(provincia);
    }

    public void updateProvincia(Provincia provincia){
        provinciaRepository.save(provincia);
    }

    public void deleteProvincia(Integer id){
        provinciaRepository.deleteById(id);
    }

}
