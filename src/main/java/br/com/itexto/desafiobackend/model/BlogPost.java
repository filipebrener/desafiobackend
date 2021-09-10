package br.com.itexto.desafiobackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "blog_post")
public class BlogPost {

    @Id
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "site_id")
    private Site site;

    @Column(name = "version")
    private Integer version;

    @Column(name = "cliques")
    private Integer cliques;

    @Column(name = "data_inclusao")
    private LocalDate dataInclusao;

    @Column(name = "data_publicacao")
    private LocalDate dataPublicacao;

    @Column(name = "resumo")
    private String resumo;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "url")
    private String url;

    @Column(name = "votos_negativos")
    private Integer votosNegativos;

    @Column(name = "votos_positivos")
    private Integer votosPositivos;

    @Column(name = "ativo")
    private Integer ativo;

    @Column(name = "tentativas")
    private Integer tentativas;

    @Column(name = "favoritos")
    private Integer favoritos;

    @Column(name = "comentarios")
    private Integer comentarios;

    @Column(name = "thumbnail")
    private String thumbnail;

}
