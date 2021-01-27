package br.com.rfsantos.producao.sevices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rfsantos.producao.domain.Produto;
import br.com.rfsantos.producao.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	
	@Autowired
	private ProdutoRepository repo;
	
	public Produto produtoEan(String leitura){
		String ean = leitura.substring(3,16);
		Produto produto = repo.findEan(ean);
		return produto;
		
	}
}
