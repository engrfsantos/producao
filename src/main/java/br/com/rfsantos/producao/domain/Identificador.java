package br.com.rfsantos.producao.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the td01_identificador database table.
 * 
 */
@Entity
@Table(name="td01_identificador")
@NamedQuery(name="Identificador.findAll", query="SELECT i FROM Identificador i")
public class Identificador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="td01_id")
	private String td01Id;

	@Column(name="td01_desc_breve")
	private String td01DescBreve;

	@Column(name="td01_descricao")
	private String td01Descricao;

	@Column(name="td01_local")
	private String td01Local;

	@Column(name="td01_status")
	private String td01Status;

	public Identificador() {
	}

	public String getTd01Id() {
		return this.td01Id;
	}

	public void setTd01Id(String td01Id) {
		this.td01Id = td01Id;
	}

	public String getTd01DescBreve() {
		return this.td01DescBreve;
	}

	public void setTd01DescBreve(String td01DescBreve) {
		this.td01DescBreve = td01DescBreve;
	}

	public String getTd01Descricao() {
		return this.td01Descricao;
	}

	public void setTd01Descricao(String td01Descricao) {
		this.td01Descricao = td01Descricao;
	}

	public String getTd01Local() {
		return this.td01Local;
	}

	public void setTd01Local(String td01Local) {
		this.td01Local = td01Local;
	}

	public String getTd01Status() {
		return this.td01Status;
	}

	public void setTd01Status(String td01Status) {
		this.td01Status = td01Status;
	}

}