package br.com.rfsantos.producao.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProdDefeitos extends JpaRepository<ProdDefeito, Long> {

	@Query(value = "SELECT u from ProdDefeito u WHERE u.td01ProdDefeitoId = ?1 ")
	List<Producao> ProdDefeitosIDProducao(Long IDProducao);
	
}
