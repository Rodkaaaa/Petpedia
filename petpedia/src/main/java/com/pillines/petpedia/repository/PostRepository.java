package com.pillines.petpedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pillines.petpedia.model.Post;

public interface PostRepository extends JpaRepository<Post,Integer>{
    
}
