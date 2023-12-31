package br.com.moriartynho.apijornadamilhas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.moriartynho.apijornadamilhas.models.Destino;

public interface DestinoRepository extends JpaRepository<Destino, Long> {

	List<Destino> findAllByNome(String nome);

}
