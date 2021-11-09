package br.com.rfsantos.producao.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rfsantos.producao.domain.Grupo;
import br.com.rfsantos.producao.repositories.GrupoRepository;

@Service
public class GrupoService {

	@Autowired
	private GrupoRepository repo;

	public List<Grupo> listar(){
		List<Grupo> obj = repo.findAll();
		return obj;
	}

	public Grupo findById(String id){
		Optional<Grupo> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
