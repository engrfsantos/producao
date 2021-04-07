package br.com.rfsantos.producao.resources;

import java.text.ParseException;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.rfsantos.producao.Filtro;
import br.com.rfsantos.producao.domain.Defeito;
import br.com.rfsantos.producao.domain.ProdDefeito;
import br.com.rfsantos.producao.domain.Producao;
import br.com.rfsantos.producao.domain.Produto;
import br.com.rfsantos.producao.domain.Usuario;
import br.com.rfsantos.producao.sevices.CondicaoService;
import br.com.rfsantos.producao.sevices.DefeitoService;
import br.com.rfsantos.producao.sevices.PostoService;
import br.com.rfsantos.producao.sevices.ProdDefeitoService;
import br.com.rfsantos.producao.sevices.ProducaoService;
import br.com.rfsantos.producao.sevices.ProdutoService;
import br.com.rfsantos.producao.sevices.SetorService;


@RestController
@RequestMapping("/lancamento")
public class LancamentoResource {

	//static private DateFormat formatterDt = new SimpleDateFormat("yyyy-MM-dd");
	//static private DateFormat formatterHr = new SimpleDateFormat("hh:mm:ss");
	
	@Autowired
	private ProducaoService producaoService;
	@Autowired
	private ProdDefeitoService prodDefeitoService;
	@Autowired
	private SetorService setores;	
	@Autowired
	private PostoService posto;	
	@Autowired
	private Usuario usuario;	
	@Autowired
	private Filtro filtro;
	@Autowired
	private ProdutoService produtos;
	@Autowired
	private CondicaoService status;
	@Autowired
	private DefeitoService defeitoService;
	
	
	private long producaoIdL=0;
		
	@RequestMapping(value="/producao/{id}", method=RequestMethod.GET)
	public ModelAndView lancamentoId (@PathVariable Long id) throws ParseException {		
		ModelAndView modelAndView = new ModelAndView("Lancamento");
			
		if (id!=null) 				
			modelAndView.addObject("producoes", producaoService.findById(id));
	//	else
		//	modelAndView.addObject("producoes", producaoService.producoesHoje());
		
		modelAndView.addObject("locais", setores.listar());
		modelAndView.addObject("postos", this.posto.listar());
		modelAndView.addObject("filtro", filtro);
		
		Producao producao = producaoService.findById(id);
		modelAndView.addObject("proddefeitos", prodDefeitoService.prodDefeitosProducaoId(producao));			
		modelAndView.addObject("producao", producao);		
		modelAndView.addObject("proddefeito", new ProdDefeito());	
		modelAndView.addObject("defeitos",  defeitoService.FindByLeitura(producao.getLeitura()));		
		modelAndView.addObject("locais", setores.listar());
		modelAndView.addObject("postos", this.posto.listar());
		modelAndView.addObject("filtro", filtro);
		
		return modelAndView;
		}

	@RequestMapping(value="/producao", method=RequestMethod.GET)
	public ModelAndView lancamento (	@RequestParam(value="setor", required = false) String setor,
										@RequestParam(value="nomeAcesso", required = false) String nomeAcesso,
										@RequestParam(value="posto", required = false) String posto,										
										@RequestParam(value="dt", required = false) String dtS) throws ParseException {		
		ModelAndView modelAndView = new ModelAndView("Lancamento");
		if (dtS!="" & dtS!=null)
			this.filtro.setDtS(dtS);
		else
			this.filtro.setDtS(LocalDate.now().toString());
		if (setor!="" & setor!=null)
			this.filtro.setSetor(setor);
		if (posto!="" & posto!=null)
			this.filtro.setPosto(posto);
		if (nomeAcesso=="" | nomeAcesso==null)
			this.filtro.setUsuario(usuario);
		else
			this.filtro.setUsuarioRe(nomeAcesso);
		
			modelAndView.addObject("producoes", producaoService.producoesHoje());
			modelAndView.addObject("locais", setores.listar());
			modelAndView.addObject("postos", this.posto.listar());
			modelAndView.addObject("filtro", filtro);
			
			Producao producao = new Producao();
			modelAndView.addObject("proddefeitos", prodDefeitoService.prodDefeitosProducaoId(producao));			
			modelAndView.addObject("producao", producao);		
			modelAndView.addObject("proddefeito", new ProdDefeito());	
			
			modelAndView.addObject("defeitos",  defeitoService.FindByLeitura(producao.getLeitura()));

			
			return modelAndView;			
		}

	
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView lancamentoProducao (@RequestParam(value="prodid", required = false) String prodid,
										@RequestParam(value="setor", required = false) String setor,
										@RequestParam(value="nomeAcesso", required = false) String nomeAcesso,
										@RequestParam(value="posto", required = false) String posto,										
										@RequestParam(value="dt", required = false) String dtS) throws ParseException {		
		ModelAndView modelAndView = new ModelAndView("Lancamento");
		if (dtS!="" & dtS!=null)
			this.filtro.setDtS(dtS);
		else
			this.filtro.setDtS(LocalDate.now().toString());
		if (setor!="" & setor!=null)
			this.filtro.setSetor(setor);
		if (posto!="" & posto!=null)
			this.filtro.setPosto(posto);
		if (nomeAcesso=="" | nomeAcesso==null)
			this.filtro.setUsuario(usuario);
		else
			this.filtro.setUsuarioRe(nomeAcesso);
		
		
		if (prodid!=null & prodid!="") { // & !id.isEmpty()) {
			producaoIdL = Long.parseLong(prodid);						
			modelAndView.addObject("producoes", producaoService.producoesId(producaoIdL)); 
			modelAndView.addObject("locais", setores.listar());
			modelAndView.addObject("postos", this.posto.listar());
			modelAndView.addObject("filtro", filtro);
			
			Producao producao = producaoService.findById(producaoIdL);
			modelAndView.addObject("proddefeitos", prodDefeitoService.prodDefeitosProducaoId(producao));			
			modelAndView.addObject("producao", producao);		
			modelAndView.addObject("proddefeito", new ProdDefeito());	
			
			modelAndView.addObject("defeitos",  defeitoService.FindByLeitura(producao.getLeitura()));

			
			return modelAndView;			
		}
		
		
		//sem filtro dt e dtf são nulos
		if (dtS!=null & dtS!="") 
			modelAndView.addObject("producoes", producaoService.producoesData(filtro)); 
		 else 
			modelAndView.addObject("producoes", producaoService.producoesHoje());
				
	
		modelAndView.addObject("locais", setores.listar());
		modelAndView.addObject("postos", this.posto.listar());
		modelAndView.addObject("filtro", filtro);
		
		Producao producao = new Producao();
		modelAndView.addObject("producao", producao);
		modelAndView.addObject("proddefeitos", prodDefeitoService.prodDefeitosProducaoId(producao));
		modelAndView.addObject("defeitos",  defeitoService.FindByLeitura(producao.getLeitura()));
		modelAndView.addObject("proddefeito", new ProdDefeito());
		
		return modelAndView;
		}

	
@PostMapping
@RequestMapping(method=RequestMethod.POST)
public ModelAndView salvar(Producao producao, @RequestParam(value="condicao", required = true) String condicao) {	
	
	ModelAndView modelAndView = new ModelAndView("Lancamento");
	String leitura = producao.getLeitura();
	Produto produto = produtos.produtoEan(leitura);

	producao.setProdutoId(produto.getId());
	producao.setDescricao(produto.getDescricao());
	producao.setSetorId(filtro.getSetor());
	producao.setUsuarioId(filtro.getUsuario().getId());
	String serie = producao.getLeitura().substring(18,24);
	producao.setSerie(serie);
	producao.setCondicaoId(this.status.findById(Integer.parseInt(condicao)));
	producao.setSetorId(filtro.getSetor());
	producao.setPostoId(filtro.getPosto());
	
	this.producaoService.save(producao);	
	
	modelAndView.addObject("producoes", producaoService.producoesId(producao.getId())); 
	modelAndView.addObject("locais", setores.listar());
	modelAndView.addObject("postos", this.posto.listar());
	modelAndView.addObject("filtro", filtro);
	modelAndView.addObject("proddefeitos", prodDefeitoService.prodDefeitosProducaoId(producao));
	modelAndView.addObject("defeitos",  defeitoService.FindByLeitura(producao.getLeitura()));
	
	modelAndView.addObject("producao", producao);
	modelAndView.addObject("proddefeito", new ProdDefeito());
	
	return modelAndView;			
}

@PostMapping
@RequestMapping(value="/proddefeito",method=RequestMethod.POST)
public ModelAndView salvar( ProdDefeito prodDefeito) {	
	
	ModelAndView modelAndView = new ModelAndView("Lancamento");
	Producao producao = producaoService.findById(prodDefeito.getProducaoId());
	modelAndView.addObject("producoes",  producaoService.findById(prodDefeito.getProducaoId())); 
	modelAndView.addObject("locais", setores.listar());
	modelAndView.addObject("postos", this.posto.listar());
	modelAndView.addObject("filtro", filtro);
	modelAndView.addObject("producao",  producao);		
	modelAndView.addObject("defeitos",  defeitoService.FindByLeitura(producao.getLeitura()));		
		
	modelAndView.addObject("proddefeitos", prodDefeitoService.prodDefeitosProducaoId(producao));
	modelAndView.addObject("proddefeito", new ProdDefeito());	
	this.prodDefeitoService.save(prodDefeito);
	return modelAndView;
	}

}
