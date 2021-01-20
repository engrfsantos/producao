package br.com.rfsantos.producao.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ts01_produto")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ts01_codigo", columnDefinition = "bpchar", length=15)
	private String id;

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

	public Produto(String id, String codBarras, String descEsp, String descricao, String grupo, String narrativa,
			String unidade) {
		this.id = id;
		this.codBarras = codBarras;
		this.descEsp = descEsp;
		this.descricao = descricao;
		this.grupo = grupo;
		this.narrativa = narrativa;
		this.unidade = unidade;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	public String getDescEsp() {
		return descEsp;
	}

	public void setDescEsp(String descEsp) {
		this.descEsp = descEsp;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getNarrativa() {
		return narrativa;
	}

	public void setNarrativa(String narrativa) {
		this.narrativa = narrativa;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
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
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}