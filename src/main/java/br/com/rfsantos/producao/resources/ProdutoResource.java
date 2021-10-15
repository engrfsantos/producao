package br.com.rfsantos.producao.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.rfsantos.producao.domain.Producao;
import br.com.rfsantos.producao.domain.Produto;
import br.com.rfsantos.producao.sevices.ProducaoService;
import br.com.rfsantos.producao.sevices.ProdutoService;



@RestController
@RequestMapping("/produto")
public class ProdutoResource {	
	
	@Autowired
	private ProdutoService produtoService;
		
		private long produtoIdL=0;
		@RequestMapping(method=RequestMethod.GET)
		public ResponseEntity<?> list(){
			List<Produto> obj = produtoService.listar();
			return ResponseEntity.ok().body(obj);
		}
		
		@RequestMapping(value="/{id}", method=RequestMethod.GET)
		public ResponseEntity<?> find(@PathVariable String id){
			Produto obj = produtoService.findById(id);
			return ResponseEntity.ok().body(obj);
		}
		


}
