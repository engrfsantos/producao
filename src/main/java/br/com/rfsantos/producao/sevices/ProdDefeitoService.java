package br.com.rfsantos.producao.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rfsantos.producao.domain.ProdDefeito;
import br.com.rfsantos.producao.domain.Producao;
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
		Optional<ProdDefeito> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public List<ProdDefeito> prodDefeitosProducaoId(Long id) {
		//Producao obj = new Producao();
		//obj.setId(id);
		return repo.prodDefeitosProducaoId(id);
	}
	
	public List<ProdDefeito> prodDefeitosProducaoId(Producao producao) {
		return repo.prodDefeitosProducaoId(producao);
	}

	public List<ProdDefeito> prodDefeitosProducao() {
		List<ProdDefeito> lst = repo.findAll();
		return lst;	
	}

	public void save(ProdDefeito prodDefeito) {
		repo.save(prodDefeito);
		return;
	}
	


}
