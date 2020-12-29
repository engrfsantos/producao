package br.com.rfsantos.producao.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Producoes extends JpaRepository<Producao,Long> {
	
	@Query(value = "SELECT u from Producao u WHERE u.td01Dt = CURRENT_DATE order by u.td01Dt, u.td01Hr DESC")
	List<Producao> ProducoesHoje();

	@Query(value = "SELECT u from Producao u WHERE u.td01Dt = ?1 order by u.td01Dt, u.td01Hr DESC")
	List<Producao> ProducoesData(Date td01Dt);

	@Query(value = "SELECT u from Producao u WHERE u.td01Dt <= ?1 order by u.td01Dt, u.td01Hr DESC")	
	List<Producao> ProducoesAte(Date dtf);
	
}
