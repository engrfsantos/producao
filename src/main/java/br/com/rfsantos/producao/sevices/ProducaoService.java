package br.com.rfsantos.producao.sevices;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rfsantos.producao.domain.Producao;
import br.com.rfsantos.producao.repositories.ProducaoRepository;

@Service
public class ProducaoService {

	@Autowired
	ProducaoRepository repo;
	
	public Producao buscar(Long producaoID){
		Optional<Producao> obj = repo.findById(producaoID);
		return obj.orElse(null);
	}	
	
	public List<Producao> producoesHoje(){
		return repo.producoesHoje();	
	}

	public List<Producao> producoesAte(Date dtf) {
		return repo.producoesAte(dtf);
	}

	public List<Producao> producoesData(Date dt) {
		return repo.producoesData(dt);
	}

	public List<Producao> producoesPeriodo(Date dt, Date dtf) {
		return repo.producoesPeriodo(dt, dtf);
	}

	public void save(Producao producao) {
		repo.save(producao);
		
	}
}
