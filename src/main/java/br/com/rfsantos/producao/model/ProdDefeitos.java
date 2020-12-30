package br.com.rfsantos.producao.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProdDefeitos extends JpaRepository<ProdDefeito, Long> {

	@Query(value = "SELECT u from ProdDefeito u WHERE u.td01ProdDefeitoId = :IdProducao")
	List<Producao> ProdDefeitosIDProducao(@Param("IdProducao") Long IDProducao);
	
}
