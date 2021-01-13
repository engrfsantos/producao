package br.com.rfsantos.producao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rfsantos.producao.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}
