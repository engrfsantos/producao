package br.com.rfsantos.producao.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rfsantos.producao.domain.Setor;

public interface SetorRepository extends JpaRepository<Setor, String> {

}
