package br.com.rfsantos.producao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.rfsantos.producao.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
	
	@Query(value = "Select u from Usuario u wHERE u.login = :login")
	Usuario findByLogin(String login);

}
