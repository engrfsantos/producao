package br.com.rfsantos.producao.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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

	//@JsonFormat(pattern="yyyy-MM-dd")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name="dt")
	private LocalDate dt;

	//@JsonFormat(pattern="HH:mm")
	@DateTimeFormat(pattern = "HH:mm")
	@Column(name="hr")
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
	
	@OneToOne
	private Condicao condicao;

	@OneToMany(mappedBy="id")  
	private List<ProdDefeito> prodDefeitos = new ArrayList<ProdDefeito>();

	public Producao() {
		this.leitura = "000000000000000000000000";
		this.dt = LocalDate.now();
		this.hr = LocalTime.now();		
	}
	
	public Producao(Filtro filto, String leitura) {		
	}
	
	

	public Producao(Long id, String produtoId, String descricao, LocalDate dt, LocalTime hr, String postoId,
			String leitura, String setorId, String usuarioId, String serie, Condicao condicao) {
		super();
		this.id = id;
		this.produtoId = produtoId;
		this.descricao = descricao;
		this.dt = dt;
		this.hr = hr;
		this.postoId = postoId;
		this.leitura = leitura;
		this.setorId = setorId;
		this.usuarioId = usuarioId;
		this.serie = serie;
		this.condicao = condicao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(String produtoId) {
		this.produtoId = produtoId;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	public String getPostoId() {
		return postoId;
	}

	public void setPostoId(String postoId) {
		this.postoId = postoId;
	}

	public String getLeitura() {
		return leitura;
	}

	public void setLeitura(String leitura) {
		this.leitura = leitura;
	}

	public String getSetorId() {
		return setorId;
	}

	public void setSetorId(String setorId) {
		this.setorId = setorId;
	}

	public String getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public Condicao getCondicao() {
		return condicao;
	}

	public void setCondicao(Condicao condicao) {
		this.condicao = condicao;
	}
		
	public List<ProdDefeito> getProdDefeitos() {
		return prodDefeitos;
	}

	public void setProdDefeitos(List<ProdDefeito> prodDefeitos) {
		this.prodDefeitos = prodDefeitos;
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