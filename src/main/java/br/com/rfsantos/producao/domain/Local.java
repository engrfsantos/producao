package br.com.rfsantos.producao.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="ts01_local")
@NamedQuery(name="Local.findAll", query="SELECT l FROM Local l")
public class Local implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id	
	@Column(name="ts01_desc")
	private String desc;

	public Local() {
	}

	public String getTs01Desc() {
		return this.desc;
	}

	public void setTs01Desc(String ts01Desc) {
		this.desc = ts01Desc;
	}

}