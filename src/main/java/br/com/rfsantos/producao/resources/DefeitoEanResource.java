package br.com.rfsantos.producao.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.rfsantos.producao.domain.Defeito;
import br.com.rfsantos.producao.sevices.DefeitoService;

@RestController
@RequestMapping(value="/defeito/ean")	
public class DefeitoEanResource {
	
	@Autowired
	private DefeitoService service;	

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> list(){
		List<Defeito> obj = service.listar();
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(value="/{ean}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable String ean){
		List<Defeito> obj = service.findByEan(ean);
		return ResponseEntity.ok().body(obj);
	}
	
	
}
