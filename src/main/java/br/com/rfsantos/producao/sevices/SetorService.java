package br.com.rfsantos.producao.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rfsantos.producao.domain.Setor;
import br.com.rfsantos.producao.repositories.SetorRepository;

@Service
public class SetorService {

	@Autowired
	private SetorRepository repo;

	public Setor buscar(String LocalID) {
		Optional <Setor> obj = repo.findById(LocalID);
		return obj.orElse(null);
	}

	public List<Setor> listar(){
		List<Setor> obj = repo.findAll();
		return obj;
	}

}
