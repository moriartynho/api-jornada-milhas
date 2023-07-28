package br.com.moriartynho.apijornadamilhas.dto;

import java.math.BigDecimal;

import org.springframework.beans.BeanUtils;

import br.com.moriartynho.apijornadamilhas.models.Destino;

public class DestinoDTO {

	private Long id;
	private byte[] imagem;
	private String nome;
	private BigDecimal preco;

	public DestinoDTO() {
	}

	public DestinoDTO(Destino destino) {
		BeanUtils.copyProperties(destino, this);
	}

	public DestinoDTO(Long id, byte[] imagem, String nome, BigDecimal preco) {
		this.id = id;
		this.imagem = imagem;
		this.nome = nome;
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

}
