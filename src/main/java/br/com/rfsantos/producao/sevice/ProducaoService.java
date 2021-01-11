package br.com.rfsantos.producao.sevice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rfsantos.producao.domain.Producao;
import br.com.rfsantos.producao.repository.ProducaoRepository;

@Service
public class ProducaoService {

	@Autowired
	ProducaoRepository repo;
	
	public Optional<Producao> buscar(Long producaoID){
		return repo.findById(producaoID);		
	}
	
	
	public List<Producao> producoesHoje(){
		return repo.ProducoesHoje();	
	}
	
	

}
