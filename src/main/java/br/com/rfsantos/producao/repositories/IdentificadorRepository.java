package br.com.rfsantos.producao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rfsantos.producao.domain.Identificador;

public interface IdentificadorRepository extends JpaRepository<Identificador, String> {

}
