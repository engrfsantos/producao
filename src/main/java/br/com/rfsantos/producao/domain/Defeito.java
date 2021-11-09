package br.com.rfsantos.producao.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="defeito")
public class Defeito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name="id", columnDefinition = "NUMERIC(19,0)")
	private Long id;

	@Column(name="descricao")
	private String descricao;

	@Column(name="ean_id")
	private String ean;

	@Column(name="grupo_id")
	private String grupoId;
	
	public Defeito() {
	}
	
	public Defeito(Long id, String descricao, String ean, String grupo) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.ean = ean;
		this.grupoId = grupo;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEan() {
		return this.ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public String getGrupo() {
		return this.grupoId;
	}

	public void setGrupo(String grupo) {
		this.grupoId = grupo;
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
		Defeito other = (Defeito) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}