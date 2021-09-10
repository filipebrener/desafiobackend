package br.com.itexto.desafiobackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "blog_post")
public class BlogPost implements Comparable<BlogPost> {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "resumo")
    private String resumo;

    @Column(name = "cliques")
    private Integer cliques;

    @Column(name = "data_inclusao")
    private LocalDateTime dataInclusao;

    @Column(name = "data_publicacao")
    private LocalDateTime dataPublicacao;

    @Column(name = "votos_positivos")
    private Integer votosPositivos;

    @Column(name = "votos_negativos")
    private Integer votosNegativos;

    @Column(name = "favoritos")
    private Integer favoritos;

    @Column(name = "comentarios")
    private Integer comentarios;

    @Column(name = "url")
    private String url;

    @ManyToOne
    @JoinColumn(name = "site_id")
    private Blog blog;

    @Column(name = "version")
    private Integer version;

    @Column(name = "ativo")
    private Integer ativo;

    @Column(name = "tentativas")
    private Integer tentativas;

    @Column(name = "thumbnail")
    private String thumbnail;

    @Override
    public int compareTo( BlogPost o) {
        if(o.getDataPublicacao().isAfter(this.dataPublicacao)) return 1;
        else return -1;
    }

}