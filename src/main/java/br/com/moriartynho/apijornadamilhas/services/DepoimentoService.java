package br.com.moriartynho.apijornadamilhas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.moriartynho.apijornadamilhas.dto.DepoimentoDTO;
import br.com.moriartynho.apijornadamilhas.models.Depoimento;
import br.com.moriartynho.apijornadamilhas.repositories.DepoimentoRepository;

@Service
public class DepoimentoService {
	
	@Autowired
	private DepoimentoRepository depoimentoRepository;

	public List<DepoimentoDTO> todosOsDepoimentos() {
		List<Depoimento> depoimentos = depoimentoRepository.findAll();
		List<DepoimentoDTO> dto = depoimentos.stream().map(x -> new DepoimentoDTO(x)).toList();
		return dto;
	}

	public DepoimentoDTO retornaDepoimentoPorId(Long id) {
		Depoimento depoimento = depoimentoRepository.getById(id);
		DepoimentoDTO dto = new DepoimentoDTO(depoimento);
		return dto;
	}

}
