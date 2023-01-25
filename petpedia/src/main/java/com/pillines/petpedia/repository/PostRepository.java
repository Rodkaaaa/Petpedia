package com.pillines.petpedia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pillines.petpedia.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

    @Query(value = "select * from post where titulo like %?1%", nativeQuery = true)
    List<Post> findAllNombrePost(String nombreComuna);

    @Query(value = "SELECT * FROM post c INNER JOIN c.comuna c", nativeQuery = true)
    List<Post> buscarRegionProvincia();

    @Query(value = "SELECT * FROM post inner join usuario on post.id_usuario = usuario.id inner join tipo_usuario on usuario.id_tipo_usuario = tipo_usuario.id where tipo_usuario='Rol_vet';", nativeQuery = true)
    List<Post> postVet();

    @Query(value = "SELECT * FROM post inner join usuario on post.id_usuario = usuario.id inner join tipo_usuario on usuario.id_tipo_usuario = tipo_usuario.id where tipo_usuario='Rol_user';", nativeQuery = true)
    List<Post> postUser();
}
