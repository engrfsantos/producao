package br.com.rfsantos.producao.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VwTotais extends JpaRepository<VwTotal, Long>{
	@Query(value = "SELECT u from VwTotal u WHERE u.dt = CURRENT_DATE")
	List<VwTotal> VwTotaisHoje();
	
}
