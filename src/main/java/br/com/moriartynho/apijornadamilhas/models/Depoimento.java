package br.com.moriartynho.apijornadamilhas.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Depoimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String corpoDoDepoimento;

	@Column(columnDefinition = "LONGBLOB")
	private byte[] imagem;
	
	private String nomeDeQuemFezODepoimento;

	public Depoimento() {

	}

	public Depoimento(Long id, String corpoDoDepoimento, byte[] imagem, String nomeDeQuemFezODepoimento) {
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
