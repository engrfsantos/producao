package br.com.rfsantos.producao.sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rfsantos.producao.domain.Condicao;
import br.com.rfsantos.producao.repositories.CondicaoRepository;

@Service
public class CondicaoService {

	@Autowired
	private CondicaoRepository repo;
	
	public List<Condicao> listar(){
		List<Condicao> obj = repo.findAll();
		return obj;
	}
	
	public Condicao findById(Integer id){
		Condicao condicao = repo.findById(id).orElse(null);
		return condicao;
	}
		
}
