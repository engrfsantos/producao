package br.com.rfsantos.producao.model;

import java.util.Date;
import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Producoes extends JpaRepository<Producao,Long> {
	
	@Query(value = "SELECT u from Producao u WHERE u.td01Dt = CURRENT_DATE order by u.td01Dt DESC, u.td01Hr DESC ")
	List<Producao> ProducoesHoje();

	@Query(value = "SELECT u from Producao u WHERE u.td01Dt = :dt order by u.td01Dt DESC, u.td01Hr DESC ")
	List<Producao> ProducoesData(@Param("dt") Date dt);

	@Query(value = "SELECT u from Producao u WHERE u.td01Dt <= :dt order by u.td01Dt DESC, u.td01Hr DESC ")	
	List<Producao> ProducoesAte(@Param("dt") Date date);

	@Query(value = "SELECT u from Producao u WHERE u.td01Dt between :dt and :dtf order by u.td01Dt DESC, u.td01Hr DESC ")
	List<Producao> ProducoesPeriodo(@Param("dt") Date dt, @Param("dtf") Date dtf);
		
}
