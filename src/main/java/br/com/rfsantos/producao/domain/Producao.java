package br.com.rfsantos.producao.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import br.com.rfsantos.producao.Filtro;

@Entity
@Table(name="producao")
public class Producao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")	
	@Column(name="id", columnDefinition = "NUMERIC(19,0)")
	private Long id;

	@Column(name="produto_id")
	private String produtoId;

	@Column(name="descricao")
	private String descricao;

	//@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name="dt")
	//private Date dt;
	private LocalDate dt;

	//@Temporal(TemporalType.TIME)
	@Column(name="hr")
	//private Date hr;
	private LocalTime hr;

	@Column(name="posto_id")
	private String postoId;

	@Column(name="leitura", columnDefinition = "bpchar", length=24)
	private String leitura;

	//@ManyToOne
	@Column(name="setor_id")
	private String setorId;

	@Column(name="usuario_id")
	private String usuarioId;

	@Column(name="serie")
	private String serie;
	
	@ManyToOne
	@JoinColumn(name="condicao_id")
	//@Column(name="td01_status")
	private Condicao condicaoId;

	public Producao() {
		
	}
	
	public Producao(Filtro filto, String leitura) {
		
	}

	//public Producao(Long id, String codigo, String descricao, Date dt, Date hr, String identificador, String leitura,
		//	String local, String re, String serie, Status status) {
	
	public Producao(Long id, String codigo, String descricao, LocalDate dt, LocalTime hr, String posto, String leitura,
			String setor, String re, String serie, Condicao condicao) {
		super();
		this.id = id;
		this.produtoId = codigo;
		this.descricao = descricao;
		this.dt = dt;
		this.hr = hr;
		this.postoId = posto;
		this.leitura = leitura;
		this.setorId = setor;
		this.usuarioId = re;
		this.serie = serie;
		this.condicaoId = condicao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return produtoId;
	}

	public void setCodigo(String codigo) {
		this.produtoId = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	//public Date getDt() {
	public LocalDate getDt() {
	
		return dt;
	}

	//public void setDt(Date dt) {
	public void setDt(LocalDate dt) {
		this.dt = dt;
	}

	//public Date getHr() {
	public LocalTime getHr() {
		return hr;
	}

	//public void setHr(Date hr) {
	public void setHr(LocalTime hr) {
		this.hr = hr;
	}

	public String getPosto() {
		return postoId;
	}

	public void setPosto(String posto) {
		this.postoId = posto;
	}

	public String getLeitura() {
		return leitura;
	}

	public void setLeitura(String leitura) {
		this.leitura = leitura;
	}

	public String getSetor() {
		return setorId;
	}

	public void setSetor(String setor) {
		this.setorId = setor;
	}

	public String getRe() {
		return usuarioId;
	}

	public void setRe(String re) {
		this.usuarioId = re;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public Condicao getCondicao() {
		return condicaoId;
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
		Producao other = (Producao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}