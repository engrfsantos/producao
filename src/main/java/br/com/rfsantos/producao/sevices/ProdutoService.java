package br.com.rfsantos.producao.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rfsantos.producao.domain.Produto;
import br.com.rfsantos.producao.repositories.ProdutoRepository;

@Service
public class ProdutoService {


	@Autowired
	private ProdutoRepository repo;

	private Produto produto;

	public Produto produtoEan(String leitura){
		String ean = leitura.substring(3,16);
		this.produto = repo.findEan(ean);
		return this.produto;
	}

	public Produto findById(String codigo){
		Optional <Produto> obj = repo.findById(codigo);
		return obj.orElse(null);
	}

	public String getId() {
		return this.produto.getId();
	}


	public List<Produto> listar(){
		List<Produto> obj = repo.findAll();
		return obj;
	}



}
