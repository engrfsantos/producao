package br.com.rfsantos.producao.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produto")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id", columnDefinition = "bpchar", length=15)
	private String id;

	@Column(name="ean")
	private String ean;

	@Column(name="desc_esp")
	private String descEsp;

	@Column(name="descricao")
	private String descricao;

	@Column(name="grupo_id")
	private String grupoId;

	@Column(name="narrativa")
	private String narrativa;

	@Column(name="unidade")
	private String unidade;

	public Produto() {
	}

	public Produto(String id, String ean, String descEsp, String descricao, String grupoId, String narrativa,
			String unidade) {
		this.id = id;
		this.ean = ean;
		this.descEsp = descEsp;
		this.descricao = descricao;
		this.grupoId = grupoId;
		this.narrativa = narrativa;
		this.unidade = unidade;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public String getDescEsp() {
		return descEsp;
	}

	public void setDescEsp(String descEsp) {
		this.descEsp = descEsp;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getGrupo() {
		return grupoId;
	}

	public void setGrupo(String grupo) {
		this.grupoId = grupo;
	}

	public String getNarrativa() {
		return narrativa;
	}

	public void setNarrativa(String narrativa) {
		this.narrativa = narrativa;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


}