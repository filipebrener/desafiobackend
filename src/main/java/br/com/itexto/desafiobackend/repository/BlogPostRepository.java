package br.com.itexto.desafiobackend.repository;

import br.com.itexto.desafiobackend.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {

    List<BlogPost> findBlogPostsByTituloOrResumoContains(String titulo,String resumo);
}
