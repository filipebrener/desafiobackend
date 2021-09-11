package br.com.itexto.desafiobackend.controller.dto;

import br.com.itexto.desafiobackend.model.Blog;
import lombok.Data;

@Data
public class BlogResponse {

    private Long id;
    private String nome;

    public BlogResponse(Blog blog) {
        this.id = blog.getId();
        this.nome = blog.getNome();
    }
}
