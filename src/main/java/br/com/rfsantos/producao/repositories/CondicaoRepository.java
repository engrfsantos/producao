package br.com.rfsantos.producao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rfsantos.producao.domain.Condicao;

public interface CondicaoRepository extends JpaRepository<Condicao, Integer> {

}
