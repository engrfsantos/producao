package br.com.rfsantos.producao.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name="td01_producao")
public class Producao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name="td01_producao_id")
	private Long producaoId;

	@Column(name="td01_cod_produto")
	private String codProduto;

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
	private String id;

	@Column(name="td01_leitura")
	private String leitura;

	@ManyToOne
	@JoinColumn(name="td01_local")
	private Local local;

	@Column(name="td01_re")
	private String re;

	@Column(name="td01_serie")
	private String serie;
	
	@ManyToOne
	@JoinColumn(name="td01_status")
	private Status status;

	public Producao() {
	}

	public Long getTd01ProducaoId() {
		return this.producaoId;
	}

	public void setTd01ProducaoId(Long td01ProducaoId) {
		this.producaoId = td01ProducaoId;
	}

	public String getTd01CodProduto() {
		return this.codProduto;
	}

	public void setTd01CodProduto(String td01CodProduto) {
		this.codProduto = td01CodProduto;
	}

	public String getTd01Descricao() {
		return this.descricao;
	}

	public void setTd01Descricao(String td01Descricao) {
		this.descricao = td01Descricao;
	}

	public Date getTd01Dt() {
		return this.dt;
	}

	public void setTd01Dt(Date td01Dt) {
		this.dt = td01Dt;
	}

	public Date getTd01Hr() {
		return this.hr;
	}

	public void setTd01Hr(Date td01Hr) {
		this.hr = td01Hr;
	}

	public String getTd01Id() {
		return this.id;
	}

	public void setTd01Id(String td01Id) {
		this.id = td01Id;
	}

	public String getTd01Leitura() {
		return this.leitura;
	}

	public void setTd01Leitura(String td01Leitura) {
		this.leitura = td01Leitura;
	}

	public Local getTd01Local() {
		return this.local;
	}

	public void setTd01Local(Local td01Local) {
		this.local = td01Local;
	}

	public String getTd01Re() {
		return this.re;
	}

	public void setTd01Re(String td01Re) {
		this.re = td01Re;
	}

	public String getTd01Serie() {
		return this.serie;
	}

	public void setTd01Serie(String td01Serie) {
		this.serie = td01Serie;
	}

	public Status getTd01Status() {
		return this.status;
	}

	public void setTd01Status(Status td01Status) {
		this.status = td01Status;
	}

}