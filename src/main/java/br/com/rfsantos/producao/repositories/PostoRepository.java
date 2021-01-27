package br.com.rfsantos.producao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rfsantos.producao.domain.Posto;

public interface PostoRepository extends JpaRepository<Posto, String> {

}
