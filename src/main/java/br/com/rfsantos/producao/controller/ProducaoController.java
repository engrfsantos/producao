package br.com.rfsantos.producao.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.rfsantos.producao.Filtro;
import br.com.rfsantos.producao.model.Locais;
import br.com.rfsantos.producao.model.ProdDefeitos;
import br.com.rfsantos.producao.model.Producao;
import br.com.rfsantos.producao.model.Producoes;

@Controller
@RequestMapping("/producoes")
public class ProducaoController {

	@Autowired
	private Producoes producoes;

	@Autowired
	private Locais locais;
	

	@GetMapping
	public ModelAndView listarProducao(@RequestParam(value="dt", required = false) String dt, @RequestParam(value="dtf", required = false) String dtf) throws ParseException {		
		ModelAndView modelAndView = new ModelAndView("ListaProducoes");
		
		Filtro filtro = new Filtro(dt, dtf); 
		
		//sem filtro dt e dtf são nulos
		if (!filtro.isbFiltrado()) {
			modelAndView.addObject("producoes", producoes.ProducoesHoje());
			
		} else {
			
			if (filtro.isbPeriodo()) {
				
				//dt é nulo e dtf é preenchido - todos dias até dtf
				if ((dt==null)&(dtf!=null)) {
					modelAndView.addObject("producoes", producoes.ProducoesAte(filtro.getDtf())); }					
				
				//dtf é nulo - somente dia selecionado				
				if ((dt!=null)&(dtf==null)) {		
					modelAndView.addObject("producoes", producoes.ProducoesData(filtro.getDt())); }
				 
				if ((dt!=null)&(dtf!=null)) {		
					modelAndView.addObject("producoes", producoes.ProducoesPeriodo(filtro.getDt(), filtro.getDtf())); }
				} 

			if (!filtro.isbPeriodo()) {
					modelAndView.addObject("producoes", producoes.ProducoesData(filtro.getDt())); }
		}
	
		modelAndView.addObject("locais", locais.findAll());
		modelAndView.addObject("filtro", filtro);
		
		
		modelAndView.addObject(new Producao());	
		
		return modelAndView;
		}

	@PostMapping
	public String salvar(Producao producao) {
		this.producoes.save(producao);
		return "redirect:/producoes";
	}
}
