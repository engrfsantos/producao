package br.com.rfsantos.producao.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="ts01_produto")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name="ts01_codigo")
	private String codigo;

	@Column(name="ts01_cod_barras")
	private String codBarras;

	@Column(name="ts01_desc_esp")
	private String descEsp;

	@Column(name="ts01_descricao")
	private String descricao;

	@Column(name="ts01_grupo")
	private String grupo;

	@Column(name="ts01_narrativa")
	private String narrativa;

	@Column(name="ts01_unidade")
	private String unidade;

	public Produto() {
	}

	public String getTs01Codigo() {
		return this.codigo;
	}

	public void setTs01Codigo(String ts01Codigo) {
		this.codigo = ts01Codigo;
	}

	public String getTs01CodBarras() {
		return this.codBarras;
	}

	public void setTs01CodBarras(String ts01CodBarras) {
		this.codBarras = ts01CodBarras;
	}

	public String getTs01DescEsp() {
		return this.descEsp;
	}

	public void setTs01DescEsp(String ts01DescEsp) {
		this.descEsp = ts01DescEsp;
	}

	public String getTs01Descricao() {
		return this.descricao;
	}

	public void setTs01Descricao(String ts01Descricao) {
		this.descricao = ts01Descricao;
	}

	public String getTs01Grupo() {
		return this.grupo;
	}

	public void setTs01Grupo(String ts01Grupo) {
		this.grupo = ts01Grupo;
	}

	public String getTs01Narrativa() {
		return this.narrativa;
	}

	public void setTs01Narrativa(String ts01Narrativa) {
		this.narrativa = ts01Narrativa;
	}

	public String getTs01Unidade() {
		return this.unidade;
	}

	public void setTs01Unidade(String ts01Unidade) {
		this.unidade = ts01Unidade;
	}

}