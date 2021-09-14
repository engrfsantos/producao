package br.com.rfsantos.producao.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.rfsantos.producao.domain.Condicao;

public interface CondicaoRepository extends JpaRepository<Condicao, Integer> {

	@Query(value = "SELECT u from Condicao u WHERE u.descricao = :descricao")	
	Optional<Condicao> findByDescricao(@Param("descricao") String descricao);
	
}
