package br.com.rfsantos.producao.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


/**
 * The persistent class for the td01_producao database table.
 * 
 */
@Entity
@Table(name="td01_producao")
//@NamedQuery(name="Producao.findAll", query="SELECT p FROM Producao p")
//@NamedQuery(name="Producao.producoesHoje", query="SELECT p FROM Producao p where p.td01_dt = now()")

public class Producao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name="td01_producao_id")
	private Long td01ProducaoId;

	@Column(name="td01_cod_produto")
	private String td01CodProduto;

	@Column(name="td01_descricao")
	private String td01Descricao;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name="td01_dt")
	private Date td01Dt;

	@Temporal(TemporalType.TIME)
	@Column(name="td01_hr")
	private Date td01Hr;

	@Column(name="td01_id")
	private String td01Id;

	@Column(name="td01_leitura")
	private String td01Leitura;

	@Column(name="td01_local")
	private String td01Local;

	@Column(name="td01_re")
	private String td01Re;

	@Column(name="td01_serie")
	private String td01Serie;
	
	@Column(name="td01_status")
	private Integer td01Status;

	public Producao() {
	}

	public Long getTd01ProducaoId() {
		return this.td01ProducaoId;
	}

	public void setTd01ProducaoId(Long td01ProducaoId) {
		this.td01ProducaoId = td01ProducaoId;
	}

	public String getTd01CodProduto() {
		return this.td01CodProduto;
	}

	public void setTd01CodProduto(String td01CodProduto) {
		this.td01CodProduto = td01CodProduto;
	}

	public String getTd01Descricao() {
		return this.td01Descricao;
	}

	public void setTd01Descricao(String td01Descricao) {
		this.td01Descricao = td01Descricao;
	}

	public Date getTd01Dt() {
		return this.td01Dt;
	}

	public void setTd01Dt(Date td01Dt) {
		this.td01Dt = td01Dt;
	}

	public Date getTd01Hr() {
		return this.td01Hr;
	}

	public void setTd01Hr(Date td01Hr) {
		this.td01Hr = td01Hr;
	}

	public String getTd01Id() {
		return this.td01Id;
	}

	public void setTd01Id(String td01Id) {
		this.td01Id = td01Id;
	}

	public String getTd01Leitura() {
		return this.td01Leitura;
	}

	public void setTd01Leitura(String td01Leitura) {
		this.td01Leitura = td01Leitura;
	}

	public String getTd01Local() {
		return this.td01Local;
	}

	public void setTd01Local(String td01Local) {
		this.td01Local = td01Local;
	}

	public String getTd01Re() {
		return this.td01Re;
	}

	public void setTd01Re(String td01Re) {
		this.td01Re = td01Re;
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