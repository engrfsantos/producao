package br.com.rfsantos.producao.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ts01_local database table.
 * 
 */
@Entity
@Table(name="ts01_local")
@NamedQuery(name="Local.findAll", query="SELECT l FROM Local l")
public class Local implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id	
	@Column(name="ts01_desc")
	private String ts01Desc;

	public Local() {
	}

	public String getTs01Desc() {
		return this.ts01Desc;
	}

	public void setTs01Desc(String ts01Desc) {
		this.ts01Desc = ts01Desc;
	}

}