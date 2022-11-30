package com.pillines.petpedia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pillines.petpedia.model.TipoUsuario;

public interface TipoUsuarioRepository extends JpaRepository<TipoUsuario, String> {
    // Query's
    @Query(value = "SELECT * FROM tipousuario WHERE tipoUsuario = ?1", nativeQuery = true)
    List<TipoUsuario> findAllTipoUsuario();

    @Query(value = "SELECT * FROM tipousuario WHERW id = ?1", nativeQuery = true)
    List<TipoUsuario> findAllId(Integer id);

    @Query(value = "SELECT * FROM tipousuario where tipousUario = ?1 AND id = ?2", nativeQuery = true)
    List<TipoUsuario> findAllTipoUsuariosId(String tipoUsuario, Integer id);
}
