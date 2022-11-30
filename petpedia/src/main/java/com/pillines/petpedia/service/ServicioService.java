package com.pillines.petpedia.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pillines.petpedia.model.Servicio;
import com.pillines.petpedia.repository.ServicioRepository;

@Service
@Transactional
public class ServicioService {

    private ServicioRepository servicioRepository;

    public ServicioService(ServicioRepository servicioRepository) {
        this.servicioRepository = servicioRepository;
    }

    // CRUD
    public List<Servicio> findAll() {
        return (List<Servicio>) servicioRepository.findAll();
    }

    public void saveServicio(Servicio servicio) {
        servicioRepository.save(servicio);
    }

    public void updateServicio(Servicio servicio) {
        servicioRepository.save(servicio);
    }

    public void deleteServicio(Integer id) {
        servicioRepository.deleteById(id);
    }

}
