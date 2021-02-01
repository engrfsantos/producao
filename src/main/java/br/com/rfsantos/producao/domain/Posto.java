package br.com.rfsantos.producao.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="posto")
public class Posto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private String id;

	@Column(name="desc_breve")
	private String descBreve;

	@Column(name="descricao")
	private String descricao;

	@Column(name="setor")
	private String setor;

	@Column(name="condicao")
	private String condicao;

	public Posto() {
	}

	public Posto(String id, String descBreve, String descricao, String setor, String condicao) {
		super();
		this.id = id;
		this.descBreve = descBreve;
		this.descricao = descricao;
		this.setor = setor;
		this.condicao = condicao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescBreve() {
		return descBreve;
	}

	public void setDescBreve(String descBreve) {
		this.descBreve = descBreve;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocal() {
		return setor;
	}

	public void setLocal(String local) {
		this.setor = local;
	}

	public String getStatus() {
		return condicao;
	}

	public void setStatus(String status) {
		this.condicao = status;
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
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posto other = (Posto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}