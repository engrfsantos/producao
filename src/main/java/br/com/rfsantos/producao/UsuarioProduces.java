package br.com.rfsantos.producao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import br.com.rfsantos.producao.domain.Usuario;

@Controller
public class UsuarioProduces {

	
	public UsuarioProduces() {
	}
		
		@Bean
		public Usuario getUsuario() {		
			//					re,   usuario,      senha, nome, status, perfil, local) {
			return new Usuario("146", "carlos146", "146", "Cadu", "A",   "O",   "PROD");			
		}

			

		
		
	

}
