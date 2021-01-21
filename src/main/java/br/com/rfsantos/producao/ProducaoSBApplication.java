package br.com.rfsantos.producao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import br.com.rfsantos.producao.domain.Usuario;

@SpringBootApplication
public class ProducaoSBApplication   implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProducaoSBApplication.class, args);
		
	}

	@Autowired
	private Usuario usuario;
	
	@Autowired
	private Filtro filtro; 
	
	
	@Override
	public void run(String... args) throws Exception {
	
	}
	
	@Bean
	public Usuario getUsuario() {		
		return new Usuario("2320", "PROD", "Reginaldo", "A", "franco", "A","A");
	}

	/*@Bean
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}*/
	
	@Bean
	public Filtro getFiltro() {		
		return new Filtro("PROD", this.usuario);
	}

	
	/*@Bean
	public void setFiltro(Filtro filtro) {
		this.filtro = filtro;
	}*/
	
	
	
}
