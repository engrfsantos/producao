package br.com.rfsantos.producao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


/**
 * The persistent class for the td01_defeito database table.
 * 
 */
@Entity
@Table(name="td01_defeito")
@NamedQuery(name="Defeito.findAll", query="SELECT d FROM Defeito d")
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

}