package br.com.rfsantos.producao.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;


/**
 * The persistent class for the ts01_produto database table.
 * 
 */
@Entity
@Table(name="ts01_produto")
@NamedQuery(name="Produto.findAll", query="SELECT p FROM Produto p")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name="ts01_codigo")
	private String ts01Codigo;

	@Column(name="ts01_cod_barras")
	private String ts01CodBarras;

	@Column(name="ts01_desc_esp")
	private String ts01DescEsp;

	@Column(name="ts01_descricao")
	private String ts01Descricao;

	@Column(name="ts01_grupo")
	private String ts01Grupo;

	@Column(name="ts01_narrativa")
	private String ts01Narrativa;

	@Column(name="ts01_unidade")
	private String ts01Unidade;

	public Produto() {
	}

	public String getTs01Codigo() {
		return this.ts01Codigo;
	}

	public void setTs01Codigo(String ts01Codigo) {
		this.ts01Codigo = ts01Codigo;
	}

	public String getTs01CodBarras() {
		return this.ts01CodBarras;
	}

	public void setTs01CodBarras(String ts01CodBarras) {
		this.ts01CodBarras = ts01CodBarras;
	}

	public String getTs01DescEsp() {
		return this.ts01DescEsp;
	}

	public void setTs01DescEsp(String ts01DescEsp) {
		this.ts01DescEsp = ts01DescEsp;
	}

	public String getTs01Descricao() {
		return this.ts01Descricao;
	}

	public void setTs01Descricao(String ts01Descricao) {
		this.ts01Descricao = ts01Descricao;
	}

	public String getTs01Grupo() {
		return this.ts01Grupo;
	}

	public void setTs01Grupo(String ts01Grupo) {
		this.ts01Grupo = ts01Grupo;
	}

	public String getTs01Narrativa() {
		return this.ts01Narrativa;
	}

	public void setTs01Narrativa(String ts01Narrativa) {
		this.ts01Narrativa = ts01Narrativa;
	}

	public String getTs01Unidade() {
		return this.ts01Unidade;
	}

	public void setTs01Unidade(String ts01Unidade) {
		this.ts01Unidade = ts01Unidade;
	}

}