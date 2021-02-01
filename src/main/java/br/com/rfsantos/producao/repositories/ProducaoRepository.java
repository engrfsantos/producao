package br.com.rfsantos.producao.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.rfsantos.producao.domain.Producao;

public interface ProducaoRepository extends JpaRepository<Producao, Long> {
	
	@Query(value = "SELECT u from Producao u WHERE u.id >= ((select Max(id) from Producao u)-2) and u.re = :re and u.setorId = :setor and u.postoId = :posto order by u.dt DESC, u.hr DESC ")
	List<Producao> producoesUsuario(@Param("re") String re, @Param("setor") String setor, @Param("posto") String posto);

	
	@Query(value = "SELECT u from Producao u WHERE u.id >= ((select Max(id) from Producao u)-2) order by u.dt DESC, u.hr DESC ")
	List<Producao> producoesHoje();

	@Query(value = "SELECT u from Producao u WHERE u.dt = :dt and u.re = :re and u.setorId = :setor and u.postoId = :posto order by u.dt DESC, u.hr DESC ")
	List<Producao> producoesData(@Param("dt") LocalDate localDate, @Param("re") String re, @Param("setor") String setor, @Param("posto") String posto);

	@Query(value = "SELECT u from Producao u WHERE u.dt <= :dt order by u.dt DESC, u.hr DESC ")	
	List<Producao> producoesAte(@Param("dt") LocalDate localDate);

	@Query(value = "SELECT u from Producao u WHERE u.dt between :dt and :dtf order by u.dt DESC, u.hr DESC ")
	List<Producao> producoesPeriodo(@Param("dt") LocalDate dt, @Param("dtf") LocalDate dtf);

	@Query(value = "SELECT u from Producao u WHERE u.id = :producaoId order by u.dt DESC, u.hr DESC ")
	List<Producao> producoesId(@Param("producaoId") Long producaoId);
	
}
