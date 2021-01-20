package br.com.rfsantos.producao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rfsantos.producao.domain.Identificador;

public interface StatusRepository extends JpaRepository<Identificador, String> {

}
