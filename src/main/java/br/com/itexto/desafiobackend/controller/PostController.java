package br.com.itexto.desafiobackend.controller;

import br.com.itexto.desafiobackend.model.BlogPost;
import br.com.itexto.desafiobackend.repository.BlogPostRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dev/All")
@AllArgsConstructor
public class PostController {

    BlogPostRepository blogPostRepository;

    @GetMapping("/post")
    public List<BlogPost> fyndByText(){
        return blogPostRepository.findAll();
    }
}
