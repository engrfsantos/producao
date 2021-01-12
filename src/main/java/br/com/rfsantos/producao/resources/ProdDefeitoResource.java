package br.com.rfsantos.producao.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.rfsantos.producao.domain.ProdDefeito;
import br.com.rfsantos.producao.repositories.ProdDefeitoRepository;

public class ProdDefeitoResource {

	@Autowired
	private ProdDefeitoRepository repo;
	
	public ProdDefeito buscar(Long id) {
		Optional <ProdDefeito> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
