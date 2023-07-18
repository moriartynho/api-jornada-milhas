package br.com.moriartynho.apijornadamilhas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.moriartynho.apijornadamilhas.dto.DepoimentoDTO;
import br.com.moriartynho.apijornadamilhas.services.DepoimentoService;

@RestController
@RequestMapping("/depoimentos-home")
@CrossOrigin("*")
public class DepoimentoHomeController {
	
	@Autowired
	private DepoimentoService depoimentoService;
	
	@GetMapping
	public ResponseEntity<List<DepoimentoDTO>> retornaDepoimentosAleatorios(){
		List<DepoimentoDTO> depoimentos = depoimentoService.depoimentosAleatoriosDaHome();
		return ResponseEntity.ok().body(depoimentos);
	}

}
