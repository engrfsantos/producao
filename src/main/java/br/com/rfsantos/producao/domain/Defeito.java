package br.com.rfsantos.producao.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="td01_defeito")
public class Defeito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name="td01_defeito_id")
	private Long td01DefeitoId;

	@Column(name="td01_descricao")
	private String td01Descricao;

	@Column(name="td01_ean")
	private String td01Ean;

	@Column(name="td01_grupo")
	private String td01Grupo;

	public Defeito() {
	}

	public Long getTd01DefeitoId() {
		return this.td01DefeitoId;
	}

	public void setTd01DefeitoId(Long td01DefeitoId) {
		this.td01DefeitoId = td01DefeitoId;
	}

	public String getTd01Descricao() {
		return this.td01Descricao;
	}

	public void setTd01Descricao(String td01Descricao) {
		this.td01Descricao = td01Descricao;
	}

	public String getTd01Ean() {
		return this.td01Ean;
	}

	public void setTd01Ean(String td01Ean) {
		this.td01Ean = td01Ean;
	}

	public String getTd01Grupo() {
		return this.td01Grupo;
	}

	public void setTd01Grupo(String td01Grupo) {
		this.td01Grupo = td01Grupo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((td01DefeitoId == null) ? 0 : td01DefeitoId.hashCode());
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
		if (td01DefeitoId == null) {
			if (other.td01DefeitoId != null)
				return false;
		} else if (!td01DefeitoId.equals(other.td01DefeitoId))
			return false;
		return true;
	}

	
}