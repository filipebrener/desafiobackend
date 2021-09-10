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
@Table(name = "site")
public class Blog {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "version")
    private Integer version;

    @Column(name = "ativo")
    private Boolean ativo;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "rss")
    private String rss;

    @Column(name = "sobre")
    private String sobre;

    @Column(name = "tentativas")
    private Integer tentativas;

    @Column(name = "ultima_verificacao")
    private LocalDate ultimaVerificacao;

    @Column(name = "posts_dia")
    private Integer postsDia;

    @Column(name = "nome")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;
}
