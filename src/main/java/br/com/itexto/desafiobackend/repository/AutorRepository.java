package br.com.itexto.desafiobackend.repository;

import br.com.itexto.desafiobackend.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor,Integer> {
}
