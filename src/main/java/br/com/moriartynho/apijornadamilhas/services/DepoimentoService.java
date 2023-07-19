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

	public void inserirDepoimento(Depoimento depoimento) {
		depoimentoRepository.save(depoimento);
	}

	public void removerDepoimento(Long id) {
		Depoimento depoimento = depoimentoRepository.getById(id);
		depoimentoRepository.delete(depoimento);
		
	}

	public List<DepoimentoDTO> depoimentosAleatoriosDaHome() {
		List<DepoimentoDTO> dto = depoimentoRepository.findAleatorio().stream().map(x -> toDTO(x)).toList();
		return dto;
	}
	
	public Depoimento fromDTO(DepoimentoDTO dto) {
		return new Depoimento(dto.getId(), dto.getCorpoDoDepoimento(), dto.getImagem(), dto.getNomeDeQuemFezODepoimento());
	}
	
	public DepoimentoDTO toDTO(Depoimento depoimento) {
		return new DepoimentoDTO(depoimento.getId(), depoimento.getCorpoDoDepoimento(), depoimento.getImagem(), depoimento.getNomeDeQuemFezODepoimento());
	}

}
