package br.com.rfsantos.producao.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ts01_tabelas database table.
 * 
 */
@Entity
@Table(name="ts01_tabelas")
@NamedQuery(name="Tabela.findAll", query="SELECT t FROM Tabela t")
public class Tabela implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id	
	@Column(name="ts01_tabela")
	private String ts01Tabela;

	@Column(name="ts01_tipo")
	private String ts01Tipo;

	public Tabela() {
	}

	public String getTs01Tabela() {
		return this.ts01Tabela;
	}

	public void setTs01Tabela(String ts01Tabela) {
		this.ts01Tabela = ts01Tabela;
	}

	public String getTs01Tipo() {
		return this.ts01Tipo;
	}

	public void setTs01Tipo(String ts01Tipo) {
		this.ts01Tipo = ts01Tipo;
	}

}