package br.com.rfsantos.producao.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rfsantos.producao.domain.ProdDefeito;
import br.com.rfsantos.producao.domain.Producao;
import br.com.rfsantos.producao.repositories.ProdDefeitoRepository;

@RestController
@RequestMapping(value="/producao")
public class ProdDefeitoResource {

	@Autowired
	private ProdDefeitoRepository repo;

	

	public List<Producao> prodDefeitosProducaoId(long idL) {
		List<Producao> lst = repo.prodDefeitosProducaoId(idL);
		return lst;	
	}
}
