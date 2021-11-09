package br.com.rfsantos.producao.sevices;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rfsantos.producao.Filtro;
import br.com.rfsantos.producao.domain.Producao;
import br.com.rfsantos.producao.repositories.ProducaoRepository;

@Service
public class ProducaoService {

	@Autowired
	ProducaoRepository repo;

	public Producao findById(Long id) {
		Optional<Producao> obj = repo.findById(id);
		return obj.orElse(null);
	}


	public List<Producao> listar(){
		List<Producao> obj = repo.findAll();
		return obj;
	}

	public Producao producaoId(Long producaoID){
		Optional<Producao> obj = repo.findById(producaoID);
		return obj.orElse(null);
	}

	public List<Producao> producoesId(Long producaoId){
		List<Producao> prod = repo.producoesId(producaoId);
		return prod;
	}

	public List<Producao> producoesHoje(){
		return repo.producoesHoje();
	}

	public List<Producao> producoesAte(LocalDate localDate) {
		return repo.producoesAte(localDate);
	}

	public List<Producao> producoesData(Filtro filtro) {
		return repo.producoesData(filtro.getDt(), filtro.getUsuario().getId(), filtro.getSetor(),filtro.getPosto() );
	}

	public List<Producao> producoesPeriodo(LocalDate dt, LocalDate dtf) {
		return repo.producoesPeriodo(dt, dtf);
	}

	public void save(Producao producao) {
		repo.save(producao);
	}



}
