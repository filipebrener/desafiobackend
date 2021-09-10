package br.com.itexto.desafiobackend.controller;

import br.com.itexto.desafiobackend.model.BlogPost;
import br.com.itexto.desafiobackend.repository.BlogPostRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/dev/All/post")
@AllArgsConstructor
public class PostController {

    BlogPostRepository blogPostRepository;

    @GetMapping
    public ResponseEntity<List<BlogPost>> findByText(@RequestBody String texto){
        List<BlogPost> blogPosts = blogPostRepository.findAll();
        blogPosts = blogPosts.stream().filter( blogPost -> blogPost.getTitulo().contains(texto) ||
                blogPost.getResumo().contains(texto))
                .sorted()
                .collect(Collectors.toList());
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(blogPosts);
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<Object> findById(@PathVariable Integer id){
        Optional<BlogPost> blogPost = blogPostRepository.findById(id);
        if(blogPost.isPresent()) return ResponseEntity.ok(blogPost.get());
        else return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

}
