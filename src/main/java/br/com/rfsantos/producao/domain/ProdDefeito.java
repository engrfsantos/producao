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
@Table(name="prod_defeito")
public class ProdDefeito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name="id", columnDefinition = "NUMERIC(19,0)")
	private Long id;

	//@ManyToOne
	//@JoinColumn(name="td01_producao_id") //, columnDefinition = "NUMERIC(19,0)"
	@Column(name="producao_id", columnDefinition = "NUMERIC(19,0)")
	private Long producaoId;

	
	@Column(name="defeito_id", columnDefinition = "NUMERIC(19,0)")
	private Long defeitoId;
		
	@Column(name="analise")
	private String analise;

	
	@Temporal(TemporalType.DATE)
	@Column(name="dt")	
	private Date dt;

	@Column(name="hr")
	private Time hr;

	
	@Column(name="reparo")
	private String reparo;

	@Column(name="serie")
	private String serie;

	@ManyToOne	
	@JoinColumn(name="condicao_id")
	//@Column(name="td01_status")
	private Condicao condicaoId;

	public ProdDefeito() {
	}

	public ProdDefeito(Long id, Long producaoId, Long defeitoId, String analise, Date dt, Time hr,
			String reparo, String serie, Condicao condicao) {
		this.id = id;
		this.producaoId = producaoId;
		this.defeitoId = defeitoId;
		this.analise = analise;
		this.dt = dt;
		this.hr = hr;
		this.reparo = reparo;
		this.serie = serie;
		this.condicaoId = condicao;
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

	public Condicao getCondicao() {
		return this.condicaoId;
	}

	public void setStatus(Condicao condicao) {
		this.condicaoId = condicao;
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