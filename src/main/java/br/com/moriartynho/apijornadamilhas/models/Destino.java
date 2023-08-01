package br.com.moriartynho.apijornadamilhas.models;

import java.math.BigDecimal;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Destino {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(columnDefinition = "LONGBLOB")
	private byte[] foto1;

	@Column(columnDefinition = "LONGBLOB")
	private byte[] foto2;

	private String nome;

	private BigDecimal preco;

	@Length(max = 160)
	private String meta;

	private String descricao;

	public Destino() {
	}

	public Destino(Long id, byte[] foto1, byte[] foto2, String nome, BigDecimal preco, @Length(max = 160) String meta,
			String descricao) {
		this.id = id;
		this.foto1 = foto1;
		this.foto2 = foto2;
		this.nome = nome;
		this.preco = preco;
		this.meta = meta;
		this.descricao = descricao;
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
