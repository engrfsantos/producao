package br.com.rfsantos.producao.resources;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;

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
import br.com.rfsantos.producao.domain.Usuario;
import br.com.rfsantos.producao.sevices.SetorService;
import br.com.rfsantos.producao.sevices.PostoService;
import br.com.rfsantos.producao.sevices.ProdDefeitoService;
import br.com.rfsantos.producao.sevices.ProducaoService;
import br.com.rfsantos.producao.sevices.ProdutoService;


@RestController
@RequestMapping("/producao")
public class ProducaoResource {

	@Autowired
	private ProducaoService producoesService;
	
	@Autowired
	private ProdDefeitoService prodDefeitoService;
	
	@Autowired
	private SetorService setores;	
	
	@Autowired
	private PostoService postos;
	
	@Autowired
	private Usuario usuario;
	
	@Autowired
	private Filtro filtro;
	
	@RequestMapping(value="/{prodid}", method=RequestMethod.GET)
	public ModelAndView listarProducao (@PathVariable Long prodid) throws ParseException {		
		ModelAndView modelAndView = new ModelAndView("ListaProducoes");
		filtro.setUsuario(usuario);
		
		if (prodid!=null & prodid!=0) { // & !id.isEmpty()) {				
			modelAndView.addObject("producoes", producoesService.producoesId(prodid)); 
			modelAndView.addObject("setores", setores.listar());
			modelAndView.addObject("postos", postos.listar());
			modelAndView.addObject("filtro", filtro);
			modelAndView.addObject("proddefeitos", prodDefeitoService.prodDefeitosProducao(prodid));
			modelAndView.addObject("producao", new Producao());		
			modelAndView.addObject("proddefeito", new ProdDefeito());	
			return modelAndView;			
		}
		else
		{
			modelAndView.addObject("producoes", producoesService.producoesHoje());
			
			
		modelAndView.addObject("setores", setores.listar());
		modelAndView.addObject("postos", postos.listar());
		modelAndView.addObject("filtro", filtro);
		modelAndView.addObject("proddefeitos", prodDefeitoService.prodDefeitosProducao(prodid));
					
		modelAndView.addObject("producao", new Producao());		
		modelAndView.addObject("proddefeito", new ProdDefeito());
		
		return modelAndView;
		}
	}

	@PostMapping
	public ModelAndView salvar(Producao producao) {
		ModelAndView modelAndView = new ModelAndView("ListaProducoes");
		ProdutoService produto = new ProdutoService();
		LocalDate dt =  LocalDate.now();
		LocalTime tm = LocalTime.now();
		produto.produtoEan(producao.getLeitura());
		
		producao.setId(null);
		producao.setDt(dt);
		producao.setHr(tm);
		producao.setCodigo(produto.getId());
		producao.setSetor(filtro.getSetor());
		producao.setPosto(filtro.getPosto());
		
		
		this.producoesService.save(producao);
		
		
		modelAndView.addObject("setores", setores.listar());
		modelAndView.addObject("postos", postos.listar());
		modelAndView.addObject("filtro", filtro);
		modelAndView.addObject("proddefeitos", prodDefeitoService.prodDefeitosProducao(producao.getId()));
					
		modelAndView.addObject("producao", producao);		
		modelAndView.addObject("proddefeito", new ProdDefeito());
		
		
		return modelAndView;
	}
}
