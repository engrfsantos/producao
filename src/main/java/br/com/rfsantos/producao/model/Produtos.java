package br.com.rfsantos.producao.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Long> {
	//@Query(value = "SELECT p from Produto p WHERE p.td01CodBarras like '0107893307'")
	//Produto ProdutoCodBarras(String ean);
	
	//@Query(value = "Select p from Produto p wHERE p.td01CodBarras =$1")
	//String EanCodBarras(String leitura); 	
}
