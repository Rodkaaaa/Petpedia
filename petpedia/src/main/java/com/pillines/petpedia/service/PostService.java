package com.pillines.petpedia.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.pillines.petpedia.model.Post;
import com.pillines.petpedia.repository.PostRepository;

@Service
@Transactional
public class PostService {

    private PostRepository postRepository;

    public PostService(PostRepository postRepository){
        this.postRepository = postRepository;
    }
    
     // CRUD
    public List<Post> findAll() {
        return (List<Post>) postRepository.findAll();
    }
    
    public void savePost(Post post) {
        postRepository.save(post);
    }

    public void updatePost(Post post) {
        postRepository.save(post);
    }

    public void deletePost(Integer id) {
        postRepository.deleteById(id);
    }

}
