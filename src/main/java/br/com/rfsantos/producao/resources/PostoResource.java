package br.com.rfsantos.producao.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.rfsantos.producao.domain.Posto;
import br.com.rfsantos.producao.sevices.PostoService;

@RestController
@RequestMapping(value="/posto")
public class PostoResource {

	@Autowired
	private PostoService service;

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> list(){
		List<Posto> obj = service.listar();
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable String id){
		Posto obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}


}
