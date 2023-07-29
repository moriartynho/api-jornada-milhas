package br.com.moriartynho.apijornadamilhas;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.moriartynho.apijornadamilhas.models.Depoimento;
import br.com.moriartynho.apijornadamilhas.models.Destino;
import br.com.moriartynho.apijornadamilhas.repositories.DepoimentoRepository;
import br.com.moriartynho.apijornadamilhas.repositories.DestinoRepository;

@SpringBootApplication
public class ApiJornadaMilhasApplication implements CommandLineRunner {

	@Autowired
	DepoimentoRepository depoimentoRepository;

	@Autowired
	DestinoRepository destinoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApiJornadaMilhasApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Depoimento d1 = new Depoimento(null, "Lugar lindo", null, "Carlos");
		Depoimento d2 = new Depoimento(null, "Lugar divertido", null, "Henrique");
		Depoimento d3 = new Depoimento(null, "Lugar maravilhoso", null, "Paulo");
		Depoimento d4 = new Depoimento(null, "Lugar fantástico", null, "Alexandre");
		Depoimento d5 = new Depoimento(null, "Lugar incrível", null, "Aline");
		Depoimento d6 = new Depoimento(null, "Lugar notável", null, "Priscila");

		depoimentoRepository.saveAll(Arrays.asList(d1, d2, d3, d4, d5, d6));

		Destino dt1 = new Destino(null, null, "Paris", new BigDecimal("250.00"));
		Destino dt2 = new Destino(null, null, "Londres", new BigDecimal("250.00"));
		Destino dt3 = new Destino(null, null, "Dublin", new BigDecimal("250.00"));
		Destino dt4 = new Destino(null, null, "Tóquio", new BigDecimal("250.00"));
		Destino dt5 = new Destino(null, null, "Nova Iorque", new BigDecimal("250.00"));
		Destino dt6 = new Destino(null, null, "Fortaleza", new BigDecimal("250.00"));
		Destino dt7 = new Destino(null, null, "Paris", new BigDecimal("350.00"));
		Destino dt8 = new Destino(null, null, "Paris", new BigDecimal("450.00"));
		Destino dt9 = new Destino(null, null, "Paris", new BigDecimal("1250.00"));

		destinoRepository.saveAll(Arrays.asList(dt1, dt2, dt3, dt4, dt5, dt6, dt7, dt8, dt9));
	}

}
