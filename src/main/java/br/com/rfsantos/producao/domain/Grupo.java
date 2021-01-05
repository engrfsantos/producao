package br.com.rfsantos.producao.domain;

import java.io.Serializable;
import javax.persistence.GeneratedValue;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


/**
 * The persistent class for the ts01_grupo database table.
 * 
 */
@Entity
@Table(name="ts01_grupo")
@NamedQuery(name="Grupo.findAll", query="SELECT g FROM Grupo g")
public class Grupo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name="ts01_grupo")
	private String ts01Grupo;

	@Column(name="ts01_descbrevgrupo")
	private String ts01Descbrevgrupo;

	@Column(name="ts01_descgrupo")
	private String ts01Descgrupo;

	public Grupo() {
	}

	public String getTs01Grupo() {
		return this.ts01Grupo;
	}

	public void setTs01Grupo(String ts01Grupo) {
		this.ts01Grupo = ts01Grupo;
	}

	public String getTs01Descbrevgrupo() {
		return this.ts01Descbrevgrupo;
	}

	public void setTs01Descbrevgrupo(String ts01Descbrevgrupo) {
		this.ts01Descbrevgrupo = ts01Descbrevgrupo;
	}

	public String getTs01Descgrupo() {
		return this.ts01Descgrupo;
	}

	public void setTs01Descgrupo(String ts01Descgrupo) {
		this.ts01Descgrupo = ts01Descgrupo;
	}

}