package br.com.itexto.desafiobackend.controller;

import br.com.itexto.desafiobackend.controller.dto.BlogPostResponse;

import br.com.itexto.desafiobackend.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
@AllArgsConstructor
public class PostController {

    private PostService service;

    @GetMapping
    public ResponseEntity<List<BlogPostResponse>> findByText(@RequestParam String search){
        List<BlogPostResponse> blogPostRS = service.findBlogPostLike(search);
        return ResponseEntity.status(HttpStatus.OK).body(blogPostRS);
    }

    @GetMapping({"/clique/{id}"})
    public ResponseEntity<BlogPostResponse> findById(@PathVariable Long id){
        BlogPostResponse blogPostResponse = service.findBlogPostById(id);
        if(blogPostResponse == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        else return ResponseEntity.status(HttpStatus.OK).body(blogPostResponse);
    }

}
