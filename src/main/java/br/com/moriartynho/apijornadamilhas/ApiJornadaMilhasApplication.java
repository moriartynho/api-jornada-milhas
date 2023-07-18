package br.com.moriartynho.apijornadamilhas;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.moriartynho.apijornadamilhas.models.Depoimento;
import br.com.moriartynho.apijornadamilhas.repositories.DepoimentoRepository;

@SpringBootApplication
public class ApiJornadaMilhasApplication implements CommandLineRunner {
	
	@Autowired
	DepoimentoRepository depoimentoRepository;

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
		
	}

}
