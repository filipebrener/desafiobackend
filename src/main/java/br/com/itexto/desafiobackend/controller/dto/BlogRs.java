package br.com.itexto.desafiobackend.controller.dto;

import br.com.itexto.desafiobackend.model.Blog;
import lombok.Data;

@Data
public class BlogRs {

    private Long id;
    private String nome;

    public BlogRs(Blog blog) {
        this.id = blog.getId();
        this.nome = blog.getNome();
    }
}
