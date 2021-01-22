package br.com.rfsantos.producao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.rfsantos.producao.domain.Usuario;

@SpringBootApplication
public class ProducaoSBApplication   implements CommandLineRunner {

	@Autowired
	private Usuario usuario;
	@Autowired
	private Filtro filtro;
	
	public static void main(String[] args) {
		SpringApplication.run(ProducaoSBApplication.class, args);
		
	}
	
	
	@Override
	public void run(String... args) throws Exception {		
	}


	@Autowired
	public Filtro getFiltro() {
		return filtro;
	}


	public void setFiltro(Filtro filtro) {
		this.filtro = filtro;
	}	
	

	@Autowired
	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
	
	

