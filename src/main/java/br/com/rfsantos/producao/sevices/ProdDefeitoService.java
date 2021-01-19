package br.com.rfsantos.producao.sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rfsantos.producao.domain.ProdDefeito;
import br.com.rfsantos.producao.repositories.ProdDefeitoRepository;

@Service
public class ProdDefeitoService {
	
	@Autowired
	private ProdDefeitoRepository repo;

	public List<ProdDefeito> prodDefeitosProducaoS(String id) {
		long idL;
		if(id!=null) 
			idL = Long.parseLong(id);
		else
			idL = 0;
		return repo.prodDefeitosProducaoId(idL);
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
