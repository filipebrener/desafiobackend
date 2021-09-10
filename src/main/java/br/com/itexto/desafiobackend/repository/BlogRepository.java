package br.com.itexto.desafiobackend.repository;

import br.com.itexto.desafiobackend.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,Long> {
}
