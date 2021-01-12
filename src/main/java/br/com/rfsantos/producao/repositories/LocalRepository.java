package br.com.rfsantos.producao.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rfsantos.producao.domain.Local;

public interface LocalRepository extends JpaRepository<Local, String> {

}
