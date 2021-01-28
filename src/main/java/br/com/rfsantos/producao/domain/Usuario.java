package br.com.rfsantos.producao.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ts01_usuario")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id	
	private String re;
	@Column(name="usuario")
	private String login;
	private String senha;	
	private String nome;
	@Column(columnDefinition = "bpchar", length=1)
	private String status;	
	@Column(columnDefinition = "bpchar", length=1)
	private String perfil;
	private String local;	
	public Usuario() {
		
	}

	public Usuario(String re, String usuario, String senha, String nome, String status, String perfil, String local) {
		super();
		this.re = re;
		this.local = local;
		this.nome = nome;
		this.perfil = perfil;
		this.senha = senha;
		this.status = status;
		this.login = usuario;
	}


	public Usuario(Usuario usuario) {
		super();
		this.re = usuario.getRe();
		this.local = usuario.getLocal();
		this.nome = usuario.getNome();
		this.perfil = usuario.getPerfil();
		this.senha = usuario.getSenha();
		this.status = usuario.getStatus();
		this.login = usuario.getLogin();
	}

	public String getRe() {
		return re;
	}


	public void setRe(String re) {
		this.re = re;
	}


	public String getLocal() {
		return local;
	}


	public void setLocal(String local) {
		this.local = local;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getPerfil() {
		return perfil;
	}


	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((re == null) ? 0 : re.hashCode());
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
		Usuario other = (Usuario) obj;
		if (re == null) {
			if (other.re != null)
				return false;
		} else if (!re.equals(other.re))
			return false;
		return true;
	}
	
}