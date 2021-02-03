package br.com.rfsantos.producao.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.rfsantos.producao.Filtro;
import br.com.rfsantos.producao.domain.ProdDefeito;
import br.com.rfsantos.producao.domain.Producao;
import br.com.rfsantos.producao.sevices.PostoService;
import br.com.rfsantos.producao.sevices.ProdDefeitoService;
import br.com.rfsantos.producao.sevices.SetorService;

@RestController
@RequestMapping(value="/proddefeitos")
public class ProdDefeitosResource {
	
	@Autowired
	private SetorService setores;	
	@Autowired
	private PostoService posto;	
	@Autowired
	private ProdDefeitoService prodDefeitoService;
	@Autowired
	private Filtro filtro;

	@RequestMapping(value="/{producaoId}", method=RequestMethod.GET)
	public ModelAndView listarProducao (@PathVariable Long producaoId) {		
		ModelAndView modelAndView = new ModelAndView("ListaProdDefeitos");
		
		modelAndView.addObject("proddefeitos", prodDefeitoService.prodDefeitosProducaoId(producaoId));
		
		modelAndView.addObject("proddefeito", new ProdDefeito());
		
		return modelAndView;
		}
	

}
