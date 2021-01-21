package br.com.rfsantos.producao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.rfsantos.producao.domain.ProdDefeito;

public interface ProdDefeitoRepository extends JpaRepository<ProdDefeito, Long> {

	@Query(value = "SELECT u from ProdDefeito u")	
	List<ProdDefeito> listar();
	
	@Query(value = "SELECT u from ProdDefeito u WHERE u.producaoId = :producaoId")	
	List<ProdDefeito> prodDefeitosProducaoId(@Param("producaoId") Long producaoId);
		
}
