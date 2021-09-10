package br.com.itexto.desafiobackend.response;

import br.com.itexto.desafiobackend.model.BlogPost;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BlogPostResponseEntity {

    public BlogPostResponseEntity(BlogPost blogPost,String url){
        this.id = blogPost.getId();
        this.titulo = blogPost.getTitulo();
        this.resumo = blogPost.getResumo();
        this.cliques = blogPost.getCliques();
        this.dataInclusao = blogPost.getDataInclusao();
        this.dataPublicacao = blogPost.getDataPublicacao();
        this.votosPositivos = blogPost.getVotosPositivos();
        this.votosNegativos = blogPost.getVotosNegativos();
        this.favoritos = blogPost.getFavoritos();
        this.comentarios = blogPost.getComentarios();
        this.url = url;
        this.blog = new BlogResponseEntity(blogPost.getBlog(),url);
    }

    private Integer id;
    private String titulo;
    private String resumo;
    private Integer cliques;
    private LocalDate dataInclusao;
    private LocalDate dataPublicacao;
    private Integer votosPositivos;
    private Integer votosNegativos;
    private Integer favoritos;
    private Integer comentarios;
    private String url;
    private BlogResponseEntity blog;
}
