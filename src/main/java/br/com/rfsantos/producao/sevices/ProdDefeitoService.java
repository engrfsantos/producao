package br.com.rfsantos.producao.sevices;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rfsantos.producao.domain.ProdDefeito;
import br.com.rfsantos.producao.repositories.ProdDefeitoRepository;

@Service
public class ProdDefeitoService {
	
	@Autowired
	private ProdDefeitoRepository repo;

	public List<ProdDefeito> listar(){
		List<ProdDefeito> obj = repo.findAll();
		return obj;		
	}	
	
	public ProdDefeito findById(Long id){
		ProdDefeito obj = repo.findById(id).orElse(null);
		return obj;
	}
	
	public List<ProdDefeito> prodDefeitosProducao(Long id) {
		return repo.prodDefeitosProducaoId(id);
	}

	public List<ProdDefeito> prodDefeitosProducao() {
		List<ProdDefeito> lst = repo.findAll();
		return lst;	
	}

	public void save(ProdDefeito prodDefeito) {
		prodDefeito.setDt(LocalDate.now());
		prodDefeito.setHr(LocalTime.now());
		
		repo.save(prodDefeito);
		return;
	}
	


}
