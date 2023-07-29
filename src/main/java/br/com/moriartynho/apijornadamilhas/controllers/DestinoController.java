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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.moriartynho.apijornadamilhas.dto.DestinoDTO;
import br.com.moriartynho.apijornadamilhas.models.Destino;
import br.com.moriartynho.apijornadamilhas.services.DestinoService;

@RestController
@RequestMapping("/destinos")
@CrossOrigin("*")
public class DestinoController {

	@Autowired
	private DestinoService destinoService;

	@PostMapping
	public ResponseEntity<DestinoDTO> inserirDestino(@RequestBody DestinoDTO dto) {
		Destino destino = destinoService.fromDTO(dto);
		destinoService.inserirDestino(destino);
		return ResponseEntity.ok().build();
	}

	@GetMapping
	public ResponseEntity<List<DestinoDTO>> retornaTodosOsDestinos() {
		List<DestinoDTO> destinos = destinoService.todosOsDestinos();
		return ResponseEntity.ok().body(destinos);
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<DestinoDTO> retornaUmDepoimento(@PathVariable Long id) {
		DestinoDTO dto = destinoService.retornaDestinoPorId(id);
		return ResponseEntity.ok().body(dto);
	}

	@GetMapping(params = "nome")
	public ResponseEntity<List<DestinoDTO>> retornaUmDepoimentoPorNome(@RequestParam String nome) throws Exception {
		List<DestinoDTO> dto = destinoService.retornaDestinoPorNome(nome);
		if(dto.isEmpty()) {
			throw new Exception("Nenhum destino foi encontrado");
		}
		return ResponseEntity.ok().body(dto);
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity<DestinoDTO> editaUmDestino(@PathVariable Long id, @RequestBody DestinoDTO dto) {
		Destino destino = destinoService.fromDTO(dto);
		destinoService.inserirDestino(destino);
		return ResponseEntity.ok().build();
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<DestinoDTO> deletaUmDepoimento(@PathVariable Long id) {
		destinoService.removerDestino(id);
		return ResponseEntity.ok().build();
	}

}
