package br.com.itexto.desafiobackend.repository;

import br.com.itexto.desafiobackend.model.Site;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteRepository extends JpaRepository<Site,Integer> {
}
