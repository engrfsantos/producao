package br.com.rfsantos.producao.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rfsantos.producao.domain.ProdDefeito;
import br.com.rfsantos.producao.domain.Producao;
import br.com.rfsantos.producao.repositories.ProducaoRepository;

@Service
public class ProducaoService {

	@Autowired
	ProducaoRepository repo;
	
	public Producao buscar(Long producaoID){
		Optional <Producao> obj = repo.findById(producaoID);
		return obj.orElse(null);
	}
	
	
	public List<Producao> producoesHoje(){
		return repo.ProducoesHoje();	
	}
	
	

}
