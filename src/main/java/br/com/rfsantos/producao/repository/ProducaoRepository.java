package br.com.rfsantos.producao.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.rfsantos.producao.domain.Producao;

public interface ProducaoRepository extends JpaRepository<Producao,Long> {
	
	@Query(value = "SELECT u from Producao u WHERE u.dt = CURRENT_DATE order by u.dt DESC, u.hr DESC ")
	List<Producao> ProducoesHoje();

	@Query(value = "SELECT u from Producao u WHERE u.dt = :dt order by u.dt DESC, u.hr DESC ")
	List<Producao> ProducoesData(@Param("dt") Date dt);

	@Query(value = "SELECT u from Producao u WHERE u.dt <= :dt order by u.dt DESC, u.hr DESC ")	
	List<Producao> ProducoesAte(@Param("dt") Date date);

	@Query(value = "SELECT u from Producao u WHERE u.dt between :dt and :dtf order by u.dt DESC, u.hr DESC ")
	List<Producao> ProducoesPeriodo(@Param("dt") Date dt, @Param("dtf") Date dtf);

}
