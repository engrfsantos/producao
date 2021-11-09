package br.com.rfsantos.producao.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.rfsantos.producao.domain.Producao;
import br.com.rfsantos.producao.sevices.ProducaoService;


@RestController
@RequestMapping("/producao")
public class ProducaoResource {

	@Autowired
	private ProducaoService producaoService;


	private long producaoIdL=0;
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> list(){
		List<Producao> obj = producaoService.listar();
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable long id){
		Producao obj = producaoService.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	}
