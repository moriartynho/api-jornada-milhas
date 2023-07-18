package br.com.moriartynho.apijornadamilhas.dto;

import org.springframework.beans.BeanUtils;

import br.com.moriartynho.apijornadamilhas.models.Depoimento;

public class DepoimentoDTO {
	private Long id;
	private String corpoDoDepoimento;
	private byte[] imagem;

	public DepoimentoDTO(Depoimento depoimento) {
		BeanUtils.copyProperties(depoimento, this);
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

	
}
