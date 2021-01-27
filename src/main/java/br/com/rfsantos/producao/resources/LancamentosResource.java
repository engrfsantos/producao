package br.com.rfsantos.producao.resources;

import java.text.ParseException;
import java.util.Date;

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
import br.com.rfsantos.producao.domain.Produto;
import br.com.rfsantos.producao.domain.Status;
import br.com.rfsantos.producao.domain.Usuario;
import br.com.rfsantos.producao.sevices.LocalService;
import br.com.rfsantos.producao.sevices.PostoService;
import br.com.rfsantos.producao.sevices.ProdDefeitoService;
import br.com.rfsantos.producao.sevices.ProducaoService;
import br.com.rfsantos.producao.sevices.ProdutoService;


@RestController
@RequestMapping("/lancamentos")
public class LancamentosResource {

	@Autowired
	private ProducaoService producoesService;
	@Autowired
	private ProdDefeitoService prodDefeitoService;
	@Autowired
	private LocalService locais;	
	@Autowired
	private PostoService posto;	
	@Autowired
	private Usuario usuario;	
	@Autowired
	private Filtro filtro;
	@Autowired
	private ProdutoService produtos;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listarProducao (@RequestParam(value="id", required = false) String id,
										@RequestParam(value="local", required = false) String local,
										@RequestParam(value="re", required = false) String re,
										@RequestParam(value="posto", required = false) String posto,
										@RequestParam(value="dt", required = false) String dtS) throws ParseException {		
		ModelAndView modelAndView = new ModelAndView("Lancamentos");
		if (dtS!="" & dtS!=null)
			this.filtro.setDtS(dtS);
		else
			this.filtro.setDt(new Date());
		
		this.filtro.setLocal(local);
		this.filtro.setPosto(posto);
		this.filtro.setUsuario(usuario);
		
		if (id!=null & id!="") { // & !id.isEmpty()) {
			long producaoIdL = Long.parseLong(id);						
			modelAndView.addObject("producoes", producoesService.producoesId(producaoIdL)); 
			modelAndView.addObject("locais", locais.listar());
			modelAndView.addObject("postos", this.posto.listar());
			modelAndView.addObject("filtro", filtro);
			modelAndView.addObject("proddefeitos", prodDefeitoService.prodDefeitosProducaoS(id));
			modelAndView.addObject("producao", new Producao());		
			modelAndView.addObject("proddefeito", new ProdDefeito());	
			return modelAndView;			
		}
		
		
		//sem filtro dt e dtf são nulos
		if ((dtS!=null)) 
			modelAndView.addObject("producoes", producoesService.producoesData(filtro)); 
		 else 
			modelAndView.addObject("producoes", producoesService.producoesHoje());
				
	
		modelAndView.addObject("locais", locais.listar());
		modelAndView.addObject("postos", this.posto.listar());
		modelAndView.addObject("filtro", filtro);
		modelAndView.addObject("proddefeitos", prodDefeitoService.prodDefeitosProducaoS(id));
					
		modelAndView.addObject("producao", new Producao());		
		modelAndView.addObject("proddefeito", new ProdDefeito());
		
		return modelAndView;
		}

@PostMapping
public ModelAndView salvar(Producao producao) {
	ModelAndView modelAndView = new ModelAndView("Lancamentos");
	
	Produto produto=produtos.produtoEan(producao.getLeitura());
	producao.setDt(filtro.getDt());
	producao.setHr(new Date());
	producao.setCodigo(produto.getId());
	producao.setDescricao(produto.getDescricao());
	producao.setLocal(filtro.getLocal());
	producao.setRe(filtro.getUsuario().getRe());
	producao.setSerie(producao.getLeitura().substring(19,24));
	Status status = new Status();
	status.setId(1);
	producao.setStatus(status);
	producao.setLocal(filtro.getLocal());
	producao.setPosto(filtro.getPosto());
	
	this.producoesService.save(producao);
	
	
	modelAndView.addObject("producoes", producao.getId()); 
	modelAndView.addObject("locais", locais.listar());
	modelAndView.addObject("postos", this.posto.listar());
	modelAndView.addObject("filtro", filtro);
	modelAndView.addObject("proddefeitos", prodDefeitoService.prodDefeitosProducaoS(producao.getId().toString()));
	modelAndView.addObject("producao", producao);		
	modelAndView.addObject("proddefeito", new ProdDefeito());	
	return modelAndView;			
}

}
