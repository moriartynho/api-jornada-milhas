package br.com.moriartynho.apijornadamilhas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.moriartynho.apijornadamilhas.dto.DepoimentoDTO;
import br.com.moriartynho.apijornadamilhas.services.DepoimentoService;

@RestController
@RequestMapping("/depoimentos")
@CrossOrigin("*")
public class DepoimentoController {
	
	@Autowired
	private DepoimentoService depoimentoService;
	
	
	@PostMapping
	public ResponseEntity<DepoimentoDTO> inserirDepoimento(){
		return ResponseEntity.ok().build();
	}
	
	@GetMapping
	public ResponseEntity<List<DepoimentoDTO>> retornaTodosOsDepoimentos(){
		List<DepoimentoDTO> depoimentos = depoimentoService.todosOsDepoimentos();
		return ResponseEntity.ok().body(depoimentos);
	}
	
	@GetMapping(path ="/{id}")
	public ResponseEntity<DepoimentoDTO> retornaUmDepoimento(@PathVariable Long id){
		DepoimentoDTO dto = depoimentoService.retornaDepoimentoPorId(id);
		return ResponseEntity.ok().body(dto);
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<DepoimentoDTO> editaUmDepoimento(@PathVariable Long id){
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping(path ="/{id}")
	public ResponseEntity<DepoimentoDTO> deletaUmDepoimento(@PathVariable Long id){
		
		return ResponseEntity.ok().body(null);
	}
	

}
