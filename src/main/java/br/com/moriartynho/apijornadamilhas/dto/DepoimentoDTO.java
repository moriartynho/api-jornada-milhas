package br.com.moriartynho.apijornadamilhas.dto;

import org.springframework.beans.BeanUtils;

import br.com.moriartynho.apijornadamilhas.models.Depoimento;

public class DepoimentoDTO {
	private Long id;
	private String corpoDoDepoimento;
	private byte[] imagem;
	private String nomeDeQuemFezODepoimento;

	public DepoimentoDTO() {
	}

	public DepoimentoDTO(Depoimento depoimento) {
		BeanUtils.copyProperties(depoimento, this);
	}

	public DepoimentoDTO(Long id, String corpoDoDepoimento, byte[] imagem, String nomeDeQuemFezODepoimento) {
		this.id = id;
		this.corpoDoDepoimento = corpoDoDepoimento;
		this.imagem = imagem;
		this.nomeDeQuemFezODepoimento = nomeDeQuemFezODepoimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCorpoDoDepoimento() {
		return corpoDoDepoimento;
	}

	public void setCorpoDoDepoimento(String corpoDoDepoimento) {
		this.corpoDoDepoimento = corpoDoDepoimento;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

	public String getNomeDeQuemFezODepoimento() {
		return nomeDeQuemFezODepoimento;
	}

	public void setNomeDeQuemFezODepoimento(String nomeDeQuemFezODepoimento) {
		this.nomeDeQuemFezODepoimento = nomeDeQuemFezODepoimento;
	}

}
