package br.com.rfsantos.producao.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;


/**
 * The persistent class for the ts01_status database table.
 * 
 */
@Entity
@Table(name="ts01_status")
@NamedQuery(name="Status.findAll", query="SELECT s FROM Status s")
public class Status implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name="ts01_status")
	private Integer ts01Status;

	@Column(name="ts01_desc_breve")
	private String ts01DescBreve;

	@Column(name="ts01_descricao")
	private String ts01Descricao;

	public Status() {
	}

	public Integer getTs01Status() {
		return this.ts01Status;
	}

	public void setTs01Status(Integer ts01Status) {
		this.ts01Status = ts01Status;
	}

	public String getTs01DescBreve() {
		return this.ts01DescBreve;
	}

	public void setTs01DescBreve(String ts01DescBreve) {
		this.ts01DescBreve = ts01DescBreve;
	}

	public String getTs01Descricao() {
		return this.ts01Descricao;
	}

	public void setTs01Descricao(String ts01Descricao) {
		this.ts01Descricao = ts01Descricao;
	}

}