package br.com.rfsantos.producao.sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rfsantos.producao.domain.Defeito;
import br.com.rfsantos.producao.repositories.DefeitoRepository;

@Service
public class DefeitoService {

	@Autowired
	private DefeitoRepository repo;
	
	public List<Defeito> listar(){
		List<Defeito> obj = repo.findAll();
		return obj;
	}
	
	public Defeito findById(Long id){
		Defeito obj = repo.findById(id).orElse(null);
		return obj;
	}

	public Defeito findByEan(String ean) {
		Defeito obj = repo.findByEan(ean).orElse(null);
		return obj;
	}
		
}
