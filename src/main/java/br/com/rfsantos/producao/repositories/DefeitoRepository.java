package br.com.rfsantos.producao.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.rfsantos.producao.domain.Defeito;

public interface DefeitoRepository extends JpaRepository<Defeito, Long> {

	@Query(value = "SELECT d from Defeito d where d.ean = :ean")	
	List<Defeito> findByEan(@Param("ean") String ean);
}
