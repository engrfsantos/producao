package br.com.rfsantos.producao.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ts01_usuario database table.
 * 
 */
@Entity
@Table(name="ts01_usuario")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id	
	private String re;

	private String local;

	private String nome;

	@Column(columnDefinition = "bpchar", length=1)
	private String perfil;

	private String senha;
	
	@Column(columnDefinition = "bpchar", length=1)
	private String status;

	private String usuario;

	public Usuario() {
	}

	public String getRe() {
		return this.re;
	}

	public void setRe(String re) {
		this.re = re;
	}

	public String getLocal() {
		return this.local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPerfil() {
		return this.perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}