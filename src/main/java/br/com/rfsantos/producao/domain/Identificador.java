package br.com.rfsantos.producao.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="td01_identificador")
public class Identificador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="td01_id")
	private String id;

	@Column(name="td01_desc_breve")
	private String descBreve;

	@Column(name="td01_descricao")
	private String descricao;

	@Column(name="td01_local")
	private String local;

	@Column(name="td01_status")
	private String status;

	public Identificador() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescBreve() {
		return this.descBreve;
	}

	public void setDescBreve(String descBreve) {
		this.descBreve = descBreve;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocal() {
		return this.local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getStatus() {
		return this.status;
	}

	public void setTStatus(String td01Status) {
		this.status = td01Status;
	}

}