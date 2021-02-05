package br.com.rfsantos.producao.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.rfsantos.producao.domain.ProdDefeito;
import br.com.rfsantos.producao.sevices.ProdDefeitoService;

@RestController
@RequestMapping(value="/proddefeitos")
public class ProdDefeitosResource {
	
	@Autowired
	private ProdDefeitoService prodDefeitoService;

	@RequestMapping(value="/{producaoId}", method=RequestMethod.GET)
	public ModelAndView listarProducao (@PathVariable Long producaoId) {		
		ModelAndView modelAndView = new ModelAndView("ListaProdDefeitos");
		
		modelAndView.addObject("proddefeitos", prodDefeitoService.prodDefeitosProducaoId(producaoId));
		
		modelAndView.addObject("proddefeito", new ProdDefeito());
		
		return modelAndView;
		}
	

}
