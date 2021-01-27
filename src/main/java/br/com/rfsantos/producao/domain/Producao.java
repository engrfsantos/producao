package br.com.rfsantos.producao.domain;

import java.io.Serializable;
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
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="td01_producao")
public class Producao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")	
	@Column(name="td01_producao_id", columnDefinition = "NUMERIC(19,0)")
	private Long id;

	@Column(name="td01_cod_produto")
	private String codigo;

	@Column(name="td01_descricao")
	private String descricao;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name="td01_dt")
	private Date dt;

	@Temporal(TemporalType.TIME)
	@Column(name="td01_hr")
	private Date hr;

	@Column(name="td01_id")
	private String posto;

	@Column(name="td01_leitura", columnDefinition = "bpchar", length=24)
	private String leitura;

	//@ManyToOne
	@Column(name="td01_local")
	private String local;

	@Column(name="td01_re")
	private String re;

	@Column(name="td01_serie")
	private String serie;
	
	@ManyToOne
	@JoinColumn(name="td01_status")
	//@Column(name="td01_status")
	private Status status;

	public Producao() {
		
	}

	public Producao(Long id, String codigo, String descricao, Date dt, Date hr, String identificador, String leitura,
			String local, String re, String serie, Status status) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.descricao = descricao;
		this.dt = dt;
		this.hr = hr;
		this.posto = identificador;
		this.leitura = leitura;
		this.local = local;
		this.re = re;
		this.serie = serie;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public Date getHr() {
		return hr;
	}

	public void setHr(Date hr) {
		this.hr = hr;
	}

	public String getPosto() {
		return posto;
	}

	public void setPosto(String posto) {
		this.posto = posto;
	}

	public String getLeitura() {
		return leitura;
	}

	public void setLeitura(String leitura) {
		this.leitura = leitura;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getRe() {
		return re;
	}

	public void setRe(String re) {
		this.re = re;
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
		Producao other = (Producao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}