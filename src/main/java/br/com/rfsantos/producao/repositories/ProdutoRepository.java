package br.com.rfsantos.producao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.rfsantos.producao.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

	@Query(value = "Select p from Produto p wHERE p.ean = :ean")
	Produto findEan(@Param("ean") String ean);
	}
