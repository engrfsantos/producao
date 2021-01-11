package br.com.rfsantos.producao.domain;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="td01_prod_defeito")
public class ProdDefeito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name="td01_prod_defeito_id", columnDefinition = "NUMERIC(19,0)")
	private Long prodDefeitoId;

	//@ManyToOne
	//@JoinColumn(name="td01_producao_id") //, columnDefinition = "NUMERIC(19,0)"
	@Column(name="td01_producao_id", columnDefinition = "NUMERIC(19,0)")
	private Long producaoId;

	
	@Column(name="td01_defeito_id", columnDefinition = "NUMERIC(19,0)")
	private Defeito defeitoId;
		
	@Column(name="td01_analise")
	private String analise;

	
	@Temporal(TemporalType.DATE)
	@Column(name="td01_dt")	
	private Date dt;

	@Column(name="td01_hr")
	private Time hr;

	
	@Column(name="td01_reparo")
	private String reparo;

	@Column(name="td01_serie")
	private String serie;

	//@ManyToOne	
	//@JoinColumn(name="td01_status", referencedColumnName = "ts01_status")
	@Column(name="td01_status")
	private Integer status;

	public ProdDefeito() {
	}

	public Long getTd01ProdDefeitoId() {
		return this.prodDefeitoId;
	}

	public void setTd01ProdDefeitoId(Long td01ProdDefeitoId) {
		this.prodDefeitoId = td01ProdDefeitoId;
	}

	public String getTd01Analise() {
		return this.analise;
	}

	public void setTd01Analise(String td01Analise) {
		this.analise = td01Analise;
	}

	public Defeito getTd01DefeitoId() {
		return this.defeitoId;
	}

	public void setTd01DefeitoId(Defeito td01DefeitoId) {
		this.defeitoId = td01DefeitoId;
	}

	public Date getTd01Dt() {
		return this.dt;
	}

	public void setTd01Dt(Date td01Dt) {
		this.dt = td01Dt;
	}

	public Time getTd01Hr() {
		return this.hr;
	}

	public void setTd01Hr(Time td01Hr) {
		this.hr = td01Hr;
	}

	public Long getTd01ProducaoId() {
		return this.producaoId;
	}

	public void setTd01ProducaoId(Long td01ProducaoId) {
		this.producaoId = td01ProducaoId;
	}

	public String getTd01Reparo() {
		return this.reparo;
	}

	public void setTd01Reparo(String td01Reparo) {
		this.reparo = td01Reparo;
	}

	public String getTd01Serie() {
		return this.serie;
	}

	public void setTd01Serie(String td01Serie) {
		this.serie = td01Serie;
	}

	public Integer getTd01Status() {
		return this.status;
	}

	public void setTd01Status(Integer td01Status) {
		this.status = td01Status;
	}

}