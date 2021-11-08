package br.com.rfsantos.producao.resources;

import br.com.rfsantos.producao.domain.Condicao;
import br.com.rfsantos.producao.domain.Defeito;
import br.com.rfsantos.producao.domain.ProdDefeito;
import br.com.rfsantos.producao.domain.Producao;

public class ProdDefeitoEx extends ProdDefeito {
	private static final long serialVersionUID = 1L;

	public ProdDefeitoEx() {
	}

	public ProdDefeitoEx(Producao producao, Defeito defeito, String analise, String reparo, String serie,
			Condicao condicao) {
		super(producao, defeito, analise, reparo, serie, condicao);		
	}

	public ProdDefeitoEx(Producao producao, String defeito, String analise, String reparo, String serie,
			String condicao) {
		super(producao, defeito, analise, reparo, serie, condicao);		
	}

}
