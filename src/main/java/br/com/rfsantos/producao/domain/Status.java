package br.com.rfsantos.producao.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="ts01_status")
public class Status implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name="ts01_status")
	private Integer status;

	@Column(name="ts01_desc_breve")
	private String descBreve;

	@Column(name="ts01_descricao")
	private String descricao;

	public Status() {
	}

	public Integer getTs01Status() {
		return this.status;
	}

	public void setTs01Status(Integer ts01Status) {
		this.status = ts01Status;
	}

	public String getTs01DescBreve() {
		return this.descBreve;
	}

	public void setTs01DescBreve(String ts01DescBreve) {
		this.descBreve = ts01DescBreve;
	}

	public String getTs01Descricao() {
		return this.descricao;
	}

	public void setTs01Descricao(String ts01Descricao) {
		this.descricao = ts01Descricao;
	}

}