package br.com.rfsantos.producao.resources;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.rfsantos.producao.Filtro;
import br.com.rfsantos.producao.domain.ProdDefeito;
import br.com.rfsantos.producao.domain.Producao;
import br.com.rfsantos.producao.domain.Usuario;
import br.com.rfsantos.producao.sevices.IdentificadorService;
import br.com.rfsantos.producao.sevices.LocalService;
import br.com.rfsantos.producao.sevices.ProdDefeitoService;
import br.com.rfsantos.producao.sevices.ProducaoService;


@RestController
@RequestMapping("/producoes")
public class ProducaoResource {

	@Autowired
	private ProducaoService producoesService;
	
	@Autowired
	private ProdDefeitoService prodDefeitoService;
	
	@Autowired
	private LocalService locais;	
	
	@Autowired
	private IdentificadorService identificadores;
	
	@Autowired
	private Usuario usuario;
	
	@Autowired
	private Filtro filtro;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listarProducao (@RequestParam(value="id", required = false) String id,
										@RequestParam(value="local", required = false) String local,
										@RequestParam(value="identificador", required = false) String identificador,
										@RequestParam(value="dt", required = false) String dt, 
										@RequestParam(value="dtf", required = false) String dtf) throws ParseException {		
		ModelAndView modelAndView = new ModelAndView("ListaProducoes");
		filtro.setDtS(dt);
		filtro.setDtfS(dtf);
		filtro.setLocal(local);
		filtro.setIdentificador(identificador);
		filtro.setUsuario(usuario);
		
		if (id!=null & id!="") { // & !id.isEmpty()) {
			long producaoIdL = Long.parseLong(id);						
			modelAndView.addObject("producoes", producoesService.producoesId(producaoIdL)); 
			modelAndView.addObject("locais", locais.listar());
			modelAndView.addObject("identificadores", identificadores.listar());
			modelAndView.addObject("filtro", filtro);
			modelAndView.addObject("proddefeitos", prodDefeitoService.prodDefeitosProducaoS(id));
			modelAndView.addObject("producao", new Producao());		
			modelAndView.addObject("proddefeito", new ProdDefeito());	
			return modelAndView;			
		}
		
		
		//sem filtro dt e dtf são nulos
		if (!filtro.isbFiltrado()) {
			modelAndView.addObject("producoes", producoesService.producoesHoje());
			
		} else {
			
			if (filtro.isbPeriodo()) {
				
				//dt é nulo e dtf é preenchido - todos dias até dtf
				if ((dt==null)&(dtf!=null)) {
					modelAndView.addObject("producoes", producoesService.producoesAte(filtro.getDtf())); }					
				
				//dtf é nulo - somente dia selecionado				
				if ((dt!=null)&(dtf==null)) {		
					modelAndView.addObject("producoes", producoesService.producoesData(filtro.getDt())); }
				 
				if ((dt!=null)&(dtf!=null)) {		
					modelAndView.addObject("producoes", producoesService.producoesPeriodo(filtro.getDt(), filtro.getDtf())); }
				} 

			if (!filtro.isbPeriodo()) {
					modelAndView.addObject("producoes", producoesService.producoesData(filtro.getDt())); }
		}
	
		modelAndView.addObject("locais", locais.listar());
		modelAndView.addObject("identificadores", identificadores.listar());
		modelAndView.addObject("filtro", filtro);
		modelAndView.addObject("proddefeitos", prodDefeitoService.prodDefeitosProducaoS(id));
					
		modelAndView.addObject("producao", new Producao());		
		modelAndView.addObject("proddefeito", new ProdDefeito());
		
		return modelAndView;
		}

	@PostMapping
	public String salvar(Producao producao) {
		this.producoesService.save(producao);
		return "redirect:/producoes";
	}
}
