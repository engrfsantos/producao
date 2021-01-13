package br.com.rfsantos.producao.resources;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.rfsantos.producao.Filtro;
import br.com.rfsantos.producao.domain.Producao;
import br.com.rfsantos.producao.domain.Usuario;
import br.com.rfsantos.producao.repositories.UsuarioRepository;
import br.com.rfsantos.producao.sevices.IdentificadorService;
import br.com.rfsantos.producao.sevices.LocalService;
import br.com.rfsantos.producao.sevices.ProducaoService;


@RestController
@RequestMapping("/producoes")
public class ProducaoResource {

	@Autowired
	private UsuarioRepository repo;
	
	private Optional<Usuario> usuario = repo.findById("2320");
	private Filtro filtro = new Filtro("PROD", usuario.get());

	
	@Autowired
	private ProducaoService producoes;

	@Autowired
	private LocalService locais;	
	
	@Autowired
	private IdentificadorService identificadores;	
	
	
	@RequestMapping(value="/{producaoID}", method=RequestMethod.GET)
	public ModelAndView buscarProducao(@PathVariable Long producaoID) throws ParseException {
		ModelAndView modelAndView = new ModelAndView("ListaProducoes");
		
		Producao producao = this.producoes.buscar(producaoID);		
		
		modelAndView.addObject("producoes", new ArrayList<Producao>().add(producao)); 
		modelAndView.addObject("locais", locais.listar());
		modelAndView.addObject("identificadores", identificadores.listar());
		modelAndView.addObject("filtro", filtro);
		
		return modelAndView;
		
	}
		
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listarProducao (@RequestParam(value="local", required = false) String local,
										@RequestParam(value="identificador", required = false) String identificador,
										@RequestParam(value="dt", required = false) String dt, 
										@RequestParam(value="dtf", required = false) String dtf) throws ParseException {		
		ModelAndView modelAndView = new ModelAndView("ListaProducoes");
		
		filtro.setDtS(dt);
		filtro.setDtfS(dtf);
		filtro.setLocal(local);
		filtro.setIdentificador(identificador);
		
		//sem filtro dt e dtf são nulos
		if (!filtro.isbFiltrado()) {
			modelAndView.addObject("producoes", producoes.producoesHoje());
			
		} else {
			
			if (filtro.isbPeriodo()) {
				
				//dt é nulo e dtf é preenchido - todos dias até dtf
				if ((dt==null)&(dtf!=null)) {
					modelAndView.addObject("producoes", producoes.producoesAte(filtro.getDtf())); }					
				
				//dtf é nulo - somente dia selecionado				
				if ((dt!=null)&(dtf==null)) {		
					modelAndView.addObject("producoes", producoes.producoesData(filtro.getDt())); }
				 
				if ((dt!=null)&(dtf!=null)) {		
					modelAndView.addObject("producoes", producoes.producoesPeriodo(filtro.getDt(), filtro.getDtf())); }
				} 

			if (!filtro.isbPeriodo()) {
					modelAndView.addObject("producoes", producoes.producoesData(filtro.getDt())); }
		}
	
		modelAndView.addObject("locais", locais.listar());
		modelAndView.addObject("identificadores", identificadores.listar());
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
