package br.com.rfsantos.producao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.rfsantos.producao.domain.ProdDefeito;
import br.com.rfsantos.producao.domain.Producao;

public interface ProdDefeitoRepository extends JpaRepository<ProdDefeito, Long> {

	@Query(value = "SELECT u from ProdDefeito u WHERE u.producaoId = :IdProducao")
	List<Producao> ProdDefeitosIDProducao(@Param("IdProducao") Long IDProducao);
	
}
