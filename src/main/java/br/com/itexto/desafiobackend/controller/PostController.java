package br.com.itexto.desafiobackend.controller;

import br.com.itexto.desafiobackend.controller.dto.BlogPostRs;

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

    PostService service;

    @GetMapping
    public ResponseEntity<List<BlogPostRs>> findByText(@RequestParam String search){
        List<BlogPostRs> blogPostRs = service.findBlogPostLike(search);
        return ResponseEntity.status(HttpStatus.OK).body(blogPostRs);
    }

    @GetMapping({"/clique/{id}"})
    public ResponseEntity<BlogPostRs> findById(@PathVariable Long id){
        BlogPostRs blogPostRs = service.findBlogPostById(id);
        if(blogPostRs == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        else return ResponseEntity.status(HttpStatus.OK).body(blogPostRs);
    }

}
