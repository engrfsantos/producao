package br.com.rfsantos.producao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import br.com.rfsantos.producao.domain.Usuario;

@Controller
public class FiltroProduces {
	

	@Autowired
	private Usuario usuario;

	public FiltroProduces() {
		
	}
		
	@Bean
		public Filtro getFiltro() {		
			return new Filtro("PROD", this.usuario);
		}

		
		
	

}
