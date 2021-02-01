package br.com.rfsantos.producao.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id	
	private String id;
	@Column(name="usuario")
	private String login;
	private String senha;	
	private String nome;
	@Column(columnDefinition = "bpchar", length=1)
	private String condicaoId;	
	@Column(columnDefinition = "bpchar", length=1)
	private String perfil;
	private String setor_id;	
	public Usuario() {
		
	}

	public Usuario(String re, String usuario, String senha, String nome, String condicao, String perfil, String local) {
		super();
		this.id = re;
		this.setor_id = local;
		this.nome = nome;
		this.perfil = perfil;
		this.senha = senha;
		this.condicaoId = condicao;
		this.login = usuario;
	}


	public Usuario(Usuario usuario) {
		super();
		this.id = usuario.getRe();
		this.setor_id = usuario.getLocal();
		this.nome = usuario.getNome();
		this.perfil = usuario.getPerfil();
		this.senha = usuario.getSenha();
		this.condicaoId = usuario.getCondicao();
		this.login = usuario.getLogin();
	}

	public String getRe() {
		return id;
	}


	public void setRe(String re) {
		this.id = re;
	}


	public String getLocal() {
		return setor_id;
	}


	public void setLocal(String local) {
		this.setor_id = local;
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


	public String getCondicao() {
		return condicaoId;
	}


	public void setCondicao(String condicao) {
		this.condicaoId = condicao;
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
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}