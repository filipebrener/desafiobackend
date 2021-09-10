package br.com.itexto.desafiobackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "autor")
public class Autor {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

}
