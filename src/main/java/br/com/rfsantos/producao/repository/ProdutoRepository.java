package br.com.rfsantos.producao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rfsantos.producao.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	//@Query(value = "SELECT p from Produto p WHERE p.td01CodBarras like '0107893307'")
	//Produto ProdutoCodBarras(String ean);
	
	//@Query(value = "Select p from Produto p wHERE p.codBarras =$1")
	//String EanCodBarras(String leitura); 	
}
