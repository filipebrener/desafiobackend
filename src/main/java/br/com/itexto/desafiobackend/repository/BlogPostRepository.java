package br.com.itexto.desafiobackend.repository;

import br.com.itexto.desafiobackend.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface BlogPostRepository extends JpaRepository<BlogPost, Integer> {
}
