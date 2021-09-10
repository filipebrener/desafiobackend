package br.com.itexto.desafiobackend.controller.dto;

import br.com.itexto.desafiobackend.model.Blog;
import lombok.Data;

@Data
public class BlogRs {

    private Long id;
    private String nome;

    public static BlogRs converter(Blog blog) {
        BlogRs blogRs = new BlogRs();
        blogRs.setId(blog.getId());
        blogRs.setNome(blog.getNome());
        return blogRs;
    }
}
