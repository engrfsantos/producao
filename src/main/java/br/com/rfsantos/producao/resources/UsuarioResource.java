package br.com.rfsantos.producao.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.rfsantos.producao.domain.Usuario;
import br.com.rfsantos.producao.sevices.UsuarioService;

@RestController
@RequestMapping(value="/usuario")	
public class UsuarioResource {
	
	@Autowired
	private UsuarioService service;	

	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> list(){
		List<Usuario> obj = service.listar();
		return ResponseEntity.ok().body(obj);
	}
}
