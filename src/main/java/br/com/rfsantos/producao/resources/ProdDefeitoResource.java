package br.com.rfsantos.producao.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rfsantos.producao.domain.ProdDefeito;
import br.com.rfsantos.producao.repositories.ProdDefeitoRepository;

@RestController
@RequestMapping(value="/proddefeito")
public class ProdDefeitoResource {

	@Autowired
	private ProdDefeitoRepository repo;

	@RequestMapping(value="/{prodDefeitoID}")
	public ProdDefeito find(Long prodDefeitoID) {
		Optional <ProdDefeito> obj = repo.findById(prodDefeitoID);
		return obj.orElse(null);
	}
}
