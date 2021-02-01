package br.com.rfsantos.producao.domain;

import java.io.Serializable;
import javax.persistence.GeneratedValue;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


/**
 * The persistent class for the ts01_grupo database table.
 * 
 */
@Entity
@Table(name="grupo")
public class Grupo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name="id")
	private String id;

	@Column(name="desc_breve")
	private String descBreve;

	@Column(name="descricao")
	private String descricao;

	public Grupo() {
	}
	
	public Grupo(String id, String descBreve, String descricao) {
		super();
		this.id = id;
		this.descBreve = descBreve;
		this.descricao = descricao;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescBreve() {
		return this.descBreve;
	}

	public void setDescBreve(String descBreve) {
		this.descBreve = descBreve;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
		Grupo other = (Grupo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
}