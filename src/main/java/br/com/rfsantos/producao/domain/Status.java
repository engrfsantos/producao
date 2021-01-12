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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descBreve == null) ? 0 : descBreve.hashCode());
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
		Status other = (Status) obj;
		if (descBreve == null) {
			if (other.descBreve != null)
				return false;
		} else if (!descBreve.equals(other.descBreve))
			return false;
		return true;
	}

}