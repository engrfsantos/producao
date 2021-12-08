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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="prod_defeito")
public class ProdDefeito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name="id", columnDefinition = "NUMERIC(19,0)")
	private Long id;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="producao_id")
	private Producao producao;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="defeito_id")
	private Defeito defeito;

	@Column(name="analise")
	private String analise;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name="dt")
	private LocalDate dt = LocalDate.now();

	@DateTimeFormat(pattern = "HH:mm")
	@Column(name="hr")
	private LocalTime hr = LocalTime.now();

	@Column(name="reparo")
	private String reparo;

	@Column(name="serie")
	private String serie;

	@ManyToOne
	@JoinColumn(name = "condicao_id") //, referencedColumnName = "id")
	private Condicao condicao;

	public ProdDefeito() {
	}

	public ProdDefeito(Producao producao, Defeito defeito, String analise, String reparo, String serie, Condicao condicao) {
		this.producao = producao;
		this.defeito = defeito;
		this.analise = analise;
		this.reparo = reparo;
		this.serie = serie;
		this.condicao = condicao;
	}

	public ProdDefeito(Producao producao) {
		this.id = null;
		this.producao = producao;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Producao getProducao() {
		return producao;
	}

	public void setProducao(Producao producao) {
		this.producao = producao;
	}

	public Defeito getDefeito() {
		return defeito;
	}

	public void setDefeito(Defeito defeito) {
		this.defeito = defeito;
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

	public Condicao getCondicao() {
		return this.condicao;
	}

	public void setCondicao(Condicao condicao) {
		this.condicao = condicao;
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
		if ((obj == null) || (getClass() != obj.getClass()))
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