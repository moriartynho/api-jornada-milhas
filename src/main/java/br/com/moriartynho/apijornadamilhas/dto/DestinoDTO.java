package br.com.moriartynho.apijornadamilhas.dto;

import java.math.BigDecimal;

import org.springframework.beans.BeanUtils;

import br.com.moriartynho.apijornadamilhas.models.Destino;

public class DestinoDTO {

	private Long id;
	private byte[] foto1;
	private byte[] foto2;
	private String nome;
	private BigDecimal preco;
	private String meta;
	private String descricao;

	public DestinoDTO() {
	}

	public DestinoDTO(Destino destino) {
		BeanUtils.copyProperties(destino, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public byte[] getFoto1() {
		return foto1;
	}

	public void setFoto1(byte[] foto1) {
		this.foto1 = foto1;
	}

	public byte[] getFoto2() {
		return foto2;
	}

	public void setFoto2(byte[] foto2) {
		this.foto2 = foto2;
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

	public String getMeta() {
		return meta;
	}

	public void setMeta(String meta) {
		this.meta = meta;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
