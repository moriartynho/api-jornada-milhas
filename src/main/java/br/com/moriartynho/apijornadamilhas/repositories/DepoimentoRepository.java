package br.com.moriartynho.apijornadamilhas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.moriartynho.apijornadamilhas.models.Depoimento;

public interface DepoimentoRepository extends JpaRepository<Depoimento, Long> {

	@Query("SELECT d FROM Depoimento d ORDER BY FUNCTION('RAND') LIMIT 3")
	List<Depoimento> findAleatorio();

}
