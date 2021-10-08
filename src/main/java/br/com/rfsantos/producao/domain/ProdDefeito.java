package br.com.rfsantos.producao.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="prod_defeito")
public class ProdDefeito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name="id", columnDefinition = "NUMERIC(19,0)")
	private Long id;

	@ManyToOne
	//@Column(name="producao_id", columnDefinition = "NUMERIC(19,0)")
	
	//@Column(columnDefinition = "NUMERIC(19,0)")
	@JoinColumn(name="producao_id")
	private Producao producaoId;

	@ManyToOne
	@JoinColumn(name="defeito_id")  //,columnDefinition = "BIGINT"
	private Defeito defeitoId;
		
	@Column(name="analise")
	private String analise;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	//@JsonFormat(pattern="yyyy-HH-dd")
	@Column(name="dt")	
	private LocalDate dt;

	@DateTimeFormat(pattern = "HH:mm")
	//@JsonFormat(pattern="HH:mm")
	@Column(name="hr")
	private LocalTime hr;
	
	@Column(name="reparo")
	private String reparo;

	@Column(name="serie")
	private String serie;

	@ManyToOne	
	@JoinColumn(name="condicao_id")
	//@Column(name="condicao_id")
	private Condicao condicaoId;

	
	
	public ProdDefeito() {
		this.dt = LocalDate.now();
		this.hr = LocalTime.now();
	}

	public ProdDefeito(Long id, Producao producaoId, Defeito defeitoId, String analise, LocalDate dt, LocalTime hr,
			String reparo, String serie, Condicao condicaoId) {
		this.id = id;
		this.producaoId = producaoId;
		this.defeitoId = defeitoId;
		this.analise = analise;
		this.dt = dt;
		this.hr = hr;
		this.reparo = reparo;
		this.serie = serie;
		this.condicaoId = condicaoId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Producao getProducaoId() {
		return producaoId;
	}
	
	public void setProducaoId(Producao producaoId) {
		this.producaoId = producaoId;
	}
	
	public Defeito getDefeitoId() {
		return defeitoId;
	}

	public void setDefeitoId(Defeito defeitoId) {
		this.defeitoId = defeitoId;
	}

	public String getAnalise() {
		return analise;
	}

	public void setAnalise(String analise) {
		this.analise = analise;
	}

	public LocalDate getDt() {
		return dt;
	}

	public void setDt(LocalDate dt) {
		this.dt = dt;
	}

	public LocalTime getHr() {
		return hr;
	}
	
	public String getHrStr() {
		return hr.format( DateTimeFormatter.ofPattern("HH:mm"));
	}

	public void setHr(LocalTime hr) {
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

	public Condicao getCondicaoId() {
		return this.condicaoId;
	}
	
	public void setCondicaoId(Condicao condicaoId) {
		this.condicaoId = condicaoId;
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