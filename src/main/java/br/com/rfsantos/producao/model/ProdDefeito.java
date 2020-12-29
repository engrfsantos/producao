package br.com.rfsantos.producao.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * The persistent class for the td01_prod_defeito database table.
 * 
 */
@Entity
@Table(name="td01_prod_defeito")
@NamedQuery(name="ProdDefeito.findAll", query="SELECT p FROM ProdDefeito p")
public class ProdDefeito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name="td01_prod_defeito_id")
	private Long td01ProdDefeitoId;

	@Column(name="td01_analise")
	private String td01Analise;

	@Column(name="td01_defeito_id")
	private Integer td01DefeitoId;
	
	@Temporal(TemporalType.DATE)
	@Column(name="td01_dt")	
	private Date td01Dt;

	@Column(name="td01_hr")
	private Time td01Hr;

	@Column(name="td01_producao_id")
	private Integer td01ProducaoId;

	@Column(name="td01_reparo")
	private String td01Reparo;

	@Column(name="td01_serie")
	private String td01Serie;

	@Column(name="td01_status")
	private Integer td01Status;

	public ProdDefeito() {
	}

	public Long getTd01ProdDefeitoId() {
		return this.td01ProdDefeitoId;
	}

	public void setTd01ProdDefeitoId(Long td01ProdDefeitoId) {
		this.td01ProdDefeitoId = td01ProdDefeitoId;
	}

	public String getTd01Analise() {
		return this.td01Analise;
	}

	public void setTd01Analise(String td01Analise) {
		this.td01Analise = td01Analise;
	}

	public Integer getTd01DefeitoId() {
		return this.td01DefeitoId;
	}

	public void setTd01DefeitoId(Integer td01DefeitoId) {
		this.td01DefeitoId = td01DefeitoId;
	}

	public Date getTd01Dt() {
		return this.td01Dt;
	}

	public void setTd01Dt(Date td01Dt) {
		this.td01Dt = td01Dt;
	}

	public Time getTd01Hr() {
		return this.td01Hr;
	}

	public void setTd01Hr(Time td01Hr) {
		this.td01Hr = td01Hr;
	}

	public Integer getTd01ProducaoId() {
		return this.td01ProducaoId;
	}

	public void setTd01ProducaoId(Integer td01ProducaoId) {
		this.td01ProducaoId = td01ProducaoId;
	}

	public String getTd01Reparo() {
		return this.td01Reparo;
	}

	public void setTd01Reparo(String td01Reparo) {
		this.td01Reparo = td01Reparo;
	}

	public String getTd01Serie() {
		return this.td01Serie;
	}

	public void setTd01Serie(String td01Serie) {
		this.td01Serie = td01Serie;
	}

	public Integer getTd01Status() {
		return this.td01Status;
	}

	public void setTd01Status(Integer td01Status) {
		this.td01Status = td01Status;
	}

}