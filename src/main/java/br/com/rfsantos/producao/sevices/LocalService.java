package br.com.rfsantos.producao.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rfsantos.producao.domain.Local;
import br.com.rfsantos.producao.repositories.LocalRepository;

@Service
public class LocalService {

	@Autowired
	private LocalRepository repo;
	
	public Local buscar(String LocalID) {
		Optional <Local> obj = repo.findById(LocalID);
		return obj.orElse(null);				
	}
	
	public List<Local> listar(){
		List<Local> obj = repo.findAll(); 
		return obj;
	}
	
}
