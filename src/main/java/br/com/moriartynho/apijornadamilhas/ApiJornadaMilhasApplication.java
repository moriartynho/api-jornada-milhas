package br.com.moriartynho.apijornadamilhas;

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

		

		Depoimento d1 = new Depoimento(null, "Lugar lindo", null);
		Depoimento d2 = new Depoimento(null, "Lugar divertido", null);
		
		depoimentoRepository.save(d1);
		depoimentoRepository.save(d2);
		
	}

}
