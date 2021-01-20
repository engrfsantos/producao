package br.com.rfsantos.producao.resources;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.rfsantos.producao.domain.ProdDefeito;
import br.com.rfsantos.producao.sevices.ProdDefeitoService;

@RestController
@RequestMapping(value="/proddefeitos")
public class ProdDefeitoResource {

	@Autowired
	private ProdDefeitoService prodDefeitoService;

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listarProducao (@RequestParam(value="producaoId", required = false) String producaoId)
										throws ParseException {		
		ModelAndView modelAndView = new ModelAndView("ListaProdDefeitos");
		
		modelAndView.addObject("proddefeitos", prodDefeitoService.prodDefeitosProducaoS(producaoId));
		
		modelAndView.addObject("proddefeito", new ProdDefeito());
		
		return modelAndView;
		}

	@PostMapping
	public String salvar(ProdDefeito prodDefeito) {
		this.prodDefeitoService.save(prodDefeito);
		return "redirect:/proddefeitos";
	}
	

}
