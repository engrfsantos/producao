package br.com.rfsantos.producao.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.rfsantos.producao.domain.Status;
import br.com.rfsantos.producao.sevices.StatusService;

@RestController
@RequestMapping(value="/status")	
public class StatusResource {
	
	@Autowired
	private StatusService service;	

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> list(){
		List<Status> obj = service.listar();
		return ResponseEntity.ok().body(obj);
	}
}
