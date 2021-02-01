package br.com.rfsantos.producao.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="produto_ean")
@NamedQuery(name="ProdutoEan.findAll", query="SELECT p FROM ProdutoEan p")
public class ProdutoEan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name="cod_produto")
	private String codProduto;

	private String descricao;

	private String ean;

	private String familia;

	public ProdutoEan() {
	}

	public String getCodProduto() {
		return this.codProduto;
	}

	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEan() {
		return this.ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public String getFamilia() {
		return this.familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

}