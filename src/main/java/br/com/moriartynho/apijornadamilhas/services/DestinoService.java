package br.com.moriartynho.apijornadamilhas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.moriartynho.apijornadamilhas.dto.DestinoDTO;
import br.com.moriartynho.apijornadamilhas.models.Destino;
import br.com.moriartynho.apijornadamilhas.repositories.DestinoRepository;

@Service
public class DestinoService {

	@Autowired
	private DestinoRepository destinoRepository;

	public List<DestinoDTO> todosOsDestinos() {
		List<Destino> destinos = destinoRepository.findAll();
		List<DestinoDTO> dto = destinos.stream().map(x -> new DestinoDTO(x)).toList();
		return dto;
	}

	@SuppressWarnings("deprecation")
	public DestinoDTO retornaDestinoPorId(Long id) {
		Destino destino = destinoRepository.getById(id);
		DestinoDTO dto = new DestinoDTO(destino);
		return dto;
	}

	public void inserirDestino(Destino destino) {
		destinoRepository.save(destino);
	}

	@SuppressWarnings("deprecation")
	public void removerDestino(Long id) {
		Destino destino = destinoRepository.getById(id);
		destinoRepository.delete(destino);

	}

	public Destino fromDTO(DestinoDTO dto) {
		return new Destino(dto.getId(), dto.getFoto1(), dto.getFoto2(), dto.getNome(), dto.getPreco(), dto.getMeta(), dto.getDescricao());
	}

	public DestinoDTO toDTO(Destino destino) {
		return new DestinoDTO(destino);
	}

	public List<DestinoDTO> retornaDestinoPorNome(String nome) throws Exception {
		List<Destino> destinos = destinoRepository.findAllByNome(nome);
		List<DestinoDTO> dto = destinos.stream().map(x -> new DestinoDTO(x)).toList();
		return dto;
	}

}
