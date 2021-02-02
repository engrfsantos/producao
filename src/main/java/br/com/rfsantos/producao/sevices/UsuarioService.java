package br.com.rfsantos.producao.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rfsantos.producao.domain.Usuario;
import br.com.rfsantos.producao.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	private boolean autenticado = false; 
	
	@Autowired
	private UsuarioRepository repo;
	
	public List<Usuario> listar(){
		List<Usuario> obj = repo.findAll();
		return obj;
	}
	
	public Usuario findById(String re) {
		Optional <Usuario> obj = repo.findById(re);
		return obj.orElse(null);	
	}
	
	public Usuario findByNomeAcesso(String nomeAcesso) {
		Usuario obj = repo.findByNomeAcesso(nomeAcesso);
		return obj;
	}
	
	public boolean setAutenticao(String nomeAcesso, String senha) {
		Usuario us = findByNomeAcesso(nomeAcesso);
		if (!us.equals(null)) {
			if (us.getSenha().equals(senha))
				this.autenticado = true;
			else
				this.autenticado = false;
		}
		return this.autenticado;
	}
}
