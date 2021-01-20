package br.com.rfsantos.producao.sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rfsantos.producao.domain.Identificador;
import br.com.rfsantos.producao.domain.Status;
import br.com.rfsantos.producao.repositories.IdentificadorRepository;

@Service
public class IdentificadorService {

	@Autowired
	private IdentificadorRepository repo;
	
	public List<Status> listar(){
		List<Status> obj = repo.findAll();
		return obj;		
	}	
}
