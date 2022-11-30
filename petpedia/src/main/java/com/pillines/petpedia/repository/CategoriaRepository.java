package com.pillines.petpedia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pillines.petpedia.model.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {

    // Query's
    @Query(value = "SELECT * FROM categorias WHERE nombre_categoria = ?1", nativeQuery = true)
    List<Categoria> findAllNombreCategorias(String nombreCategoria);

    @Query(value = "SELECT * FROM categorias c JOIN c.usuario us", nativeQuery = true)
    List<Categoria> buscarCategoriasUsuario();

}
