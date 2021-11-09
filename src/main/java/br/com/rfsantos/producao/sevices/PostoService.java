package br.com.rfsantos.producao.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rfsantos.producao.domain.Posto;
import br.com.rfsantos.producao.repositories.PostoRepository;

@Service
public class PostoService {

	@Autowired
	private PostoRepository repo;

	public List<Posto> listar(){
		List<Posto> obj = repo.findAll();
		return obj;
	}

	public Posto findById(String id){
		Optional<Posto> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
