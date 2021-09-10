package br.com.itexto.desafiobackend.response;

import br.com.itexto.desafiobackend.model.Autor;
import br.com.itexto.desafiobackend.model.Blog;

public class BlogResponseEntity {

    public BlogResponseEntity(Blog blog, String url) {
        this.id = blog.getId();
        this.nome = blog.getNome();
        this.resumo = blog.getRss();
        this.url = url;
        this.ativo = blog.getAtivo();
        this.autor = blog.getAutor();
    }

    private Integer id;
    private String nome;
    private String resumo;
    private String url;
    private Boolean ativo;
    private Autor autor;

}
