package br.com.itexto.desafiobackend.controller.dto;

import br.com.itexto.desafiobackend.model.BlogPost;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BlogPostRs {

    private Long id;
    private String titulo;
    private String resumo;
    private Integer cliques;
    private LocalDateTime dataInclusao;
    private LocalDateTime dataPublicacao;
    private Integer votosPositivos;
    private Integer votosNegativos;
    private Integer favoritos;
    private BlogRs blog;
    private Integer comentarios;
    private String url;
    private String thumbnail;

    public static BlogPostRs converter(BlogPost blogPost){
        BlogPostRs blogPostRs = new BlogPostRs();
        blogPostRs.setId(blogPost.getId());
        blogPostRs.setTitulo(blogPost.getTitulo());
        blogPostRs.setResumo(blogPost.getResumo());
        blogPostRs.setCliques(blogPost.getCliques());
        blogPostRs.setDataPublicacao(blogPost.getDataPublicacao());
        blogPostRs.setDataInclusao(blogPost.getDataInclusao());
        blogPostRs.setVotosPositivos(blogPost.getVotosPositivos());
        blogPostRs.setVotosNegativos(blogPost.getVotosNegativos());
        blogPostRs.setFavoritos(blogPost.getFavoritos());
        blogPostRs.setComentarios(blogPost.getComentarios());
        blogPostRs.setUrl(blogPost.getUrl());
        blogPostRs.setBlog(BlogRs.converter(blogPost.getBlog()));
        blogPostRs.setThumbnail(blogPost.getThumbnail());
        return blogPostRs;
    }

}
