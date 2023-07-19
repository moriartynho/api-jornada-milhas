package br.com.moriartynho.apijornadamilhas.repositories;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class DepoimentoRepositoryTest {
	
	@Autowired
	private DepoimentoRepository depoimentoRepository;

	@Test
	void escolherTresDepoimentosAelatorios() {
		var depoimentosHome =  depoimentoRepository.findAleatorio();
		assertThat(depoimentosHome).isNotEmpty();
		assertEquals(depoimentosHome.size(), 3);
	}

}
