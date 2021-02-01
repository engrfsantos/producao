package br.com.rfsantos.producao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rfsantos.producao.domain.Defeito;

public interface DefeitoRepository extends JpaRepository<Defeito, Long> {

}
