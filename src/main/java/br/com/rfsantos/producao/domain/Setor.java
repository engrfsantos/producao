package br.com.rfsantos.producao.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="setor")
public class Setor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id", columnDefinition = "bpchar", length=4)
	private String id;

	public Setor() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

}