package br.com.rfsantos.producao.domain;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	private Long id;

	//@ManyToOne
	//@JoinColumn(name="td01_producao_id") //, columnDefinition = "NUMERIC(19,0)"
	@Column(name="td01_producao_id", columnDefinition = "NUMERIC(19,0)")
	private Long producaoId;

	
	@Column(name="td01_defeito_id", columnDefinition = "NUMERIC(19,0)")
	private Long defeitoId;
		
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

	@ManyToOne	
	@JoinColumn(name="td01_status")
	//@Column(name="td01_status")
	private Status status;

	public ProdDefeito() {
	}

	public ProdDefeito(Long id, Long producaoId, Long defeitoId, String analise, Date dt, Time hr,
			String reparo, String serie, Status status) {
		this.id = id;
		this.producaoId = producaoId;
		this.defeitoId = defeitoId;
		this.analise = analise;
		this.dt = dt;
		this.hr = hr;
		this.reparo = reparo;
		this.serie = serie;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProducaoId() {
		return producaoId;
	}

	public void setProducaoId(Long producaoId) {
		this.producaoId = producaoId;
	}

	public Long getDefeitoId() {
		return defeitoId;
	}

	public void setDefeitoId(Long defeitoId) {
		this.defeitoId = defeitoId;
	}

	public String getAnalise() {
		return analise;
	}

	public void setAnalise(String analise) {
		this.analise = analise;
	}

	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public Time getHr() {
		return hr;
	}

	public void setHr(Time hr) {
		this.hr = hr;
	}

	public String getReparo() {
		return reparo;
	}

	public void setReparo(String reparo) {
		this.reparo = reparo;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
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
		ProdDefeito other = (ProdDefeito) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}