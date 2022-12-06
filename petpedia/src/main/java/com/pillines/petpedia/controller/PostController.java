package com.pillines.petpedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pillines.petpedia.model.Post;
import com.pillines.petpedia.service.PostService;

@RestController
@CrossOrigin("*")
public class PostController {
    
    private PostService postService;

    public PostController(@Autowired PostService postService){
        this.postService = postService;
    }

    @GetMapping("/post/getAll")
    public List<Post> findAll() {
        return (List<Post>) postService.findAll();
    }

    @PostMapping("post/save/")
    public void savePost(@RequestBody Post post) {
        postService.savePost(post);
    }
    @PutMapping("post/update/")
    public void updatePost(@RequestBody Post post) {
        postService.updatePost(post);
    }
    @DeleteMapping("post/delete/{id}")
    public void deletePost(@PathVariable("id") Integer id) {
        postService.deletePost(id);
    }
}
