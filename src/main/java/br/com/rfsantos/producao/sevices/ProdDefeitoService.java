package br.com.rfsantos.producao.sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rfsantos.producao.domain.Producao;
import br.com.rfsantos.producao.resources.ProdDefeitoResource;

@Service
public class ProdDefeitoService {
	
	@Autowired
	private ProdDefeitoResource repo;

	public List<Producao> listar(String id) {
		long idL;
		if(id!=null) 
			idL = Long.parseLong(id);
		else
			idL = 0;
		return repo.prodDefeitosProducaoId(idL);
	}



}
