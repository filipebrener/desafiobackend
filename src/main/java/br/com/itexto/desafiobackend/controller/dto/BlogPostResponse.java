package br.com.itexto.desafiobackend.controller.dto;

import br.com.itexto.desafiobackend.model.BlogPost;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BlogPostResponse {

    private Long id;
    private String titulo;
    private String resumo;
    private Integer cliques;
    private LocalDateTime dataInclusao;
    private LocalDateTime dataPublicacao;
    private Integer votosPositivos;
    private Integer votosNegativos;
    private Integer favoritos;
    private BlogResponse blog;
    private Integer comentarios;
    private String url;
    private String thumbnail;

    public BlogPostResponse(BlogPost blogPost){
        this.id = blogPost.getId();
        this.titulo = blogPost.getTitulo();
        this.resumo = blogPost.getResumo();
        this.cliques = blogPost.getCliques();
        this.dataPublicacao = blogPost.getDataPublicacao();
        this.dataInclusao = blogPost.getDataInclusao();
        this.votosPositivos = blogPost.getVotosPositivos();
        this.votosNegativos = blogPost.getVotosNegativos();
        this.favoritos = blogPost.getFavoritos();
        this.comentarios = blogPost.getComentarios();
        this.url = blogPost.getUrl();
        this.blog = new BlogResponse(blogPost.getBlog());
        this.thumbnail = blogPost.getThumbnail();
    }

    // Este método ocuta a URL de um blog atribuindo null
    public void ocultarURL(){
        this.url = null;
    }

    // Este método irá atribuir o valor 0 aos atributos do tipo Integer que possuirem null.
    // Este método ira alterar se necessario apenas os atributos: favoritos, comentários
    public void nullToZero(){
        if(this.favoritos == null) this.favoritos = 0;
        if(this.comentarios == null) this.comentarios = 0;
    }


}
