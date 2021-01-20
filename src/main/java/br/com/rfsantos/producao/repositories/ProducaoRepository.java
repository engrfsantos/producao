package br.com.rfsantos.producao.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.rfsantos.producao.domain.Producao;

public interface ProducaoRepository extends JpaRepository<Producao, Long> {
	
	@Query(value = "SELECT u from Producao u WHERE u.id >= ((select Max(id) from Producao u)-2) order by u.dt DESC, u.hr DESC ")
	List<Producao> producoesHoje();

	@Query(value = "SELECT u from Producao u WHERE u.dt = :dt order by u.dt DESC, u.hr DESC ")
	List<Producao> producoesData(@Param("dt") Date dt);

	@Query(value = "SELECT u from Producao u WHERE u.dt <= :dt order by u.dt DESC, u.hr DESC ")	
	List<Producao> producoesAte(@Param("dt") Date date);

	@Query(value = "SELECT u from Producao u WHERE u.dt between :dt and :dtf order by u.dt DESC, u.hr DESC ")
	List<Producao> producoesPeriodo(@Param("dt") Date dt, @Param("dtf") Date dtf);

	@Query(value = "SELECT u from Producao u WHERE u.id = :producaoId order by u.dt DESC, u.hr DESC ")
	List<Producao> producoesId(@Param("producaoId") Long producaoId);
	
	

}
