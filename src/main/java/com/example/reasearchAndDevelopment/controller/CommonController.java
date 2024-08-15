package com.example.reasearchAndDevelopment.controller;

import com.example.reasearchAndDevelopment.entity.Post;
import com.example.reasearchAndDevelopment.repository.PostRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CommonController {
    private final PostRepository postRepository;

    public CommonController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    @GetMapping("/message")
    public String greetingMessage(){
        return "Hello world";
    }

    @PostMapping("/post")
    public String postMessage(@RequestBody Post post){
        postRepository.save(post);
        return "successfully";
    }

    @GetMapping("/post")
    public List<Post> findAllPosts(){
        return postRepository.findAll();
    }
}
