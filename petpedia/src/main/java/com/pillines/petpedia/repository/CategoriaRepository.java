package com.pillines.petpedia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pillines.petpedia.model.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria, Integer> {


    @Query(value = "SELECT * FROM categorias WHERE nombre_categoria = ?1", nativeQuery = true)
    List<Categoria> findAllNombreCategorias(String nombreCategoria);

    @Query(value = "SELECT * FROM categorias c JOIN c.usuario us", nativeQuery = true)
    List<Categoria> buscarCategoriasUsuario();
}
