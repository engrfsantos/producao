package br.com.rfsantos.producao.sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rfsantos.producao.domain.Status;
import br.com.rfsantos.producao.repositories.StatusRepository;

@Service
public class StatusService {

	@Autowired
	private StatusRepository repo;
	
	public List<Status> listar(){
		List<Status> obj = repo.findAll();
		return obj;
	}
	
	public Status findById(Integer id){
		Status status = repo.findById(id).orElse(null);
		return status;
	}
		
}
