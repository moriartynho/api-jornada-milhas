package br.com.moriartynho.apijornadamilhas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.moriartynho.apijornadamilhas.models.Depoimento;

public interface DepoimentoRepository extends JpaRepository<Depoimento, Long> {

}
