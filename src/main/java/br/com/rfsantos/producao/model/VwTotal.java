package br.com.rfsantos.producao.model;

import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vw_total database table.
 * 
 */
@Entity
@Table(name="vw_total")
//@NamedQuery(name="VwTotal.findAll", query="SELECT v FROM VwTotal v")
public class VwTotal  {
	//private static final long serialVersionUID = 1L;
	
	private String anadef;
	
	private String codbarras;

	private String codbarrasrep;

	private String codigo;

	private String def;

	private String descesp;

	private String descr;

	@Temporal(TemporalType.DATE)
	private Date dt;

	@Temporal(TemporalType.DATE)
	private Date dtrep;

	private String ean;

	private String eanrep;

	private String grupo;

	private String hora;

	private String hrrep;

	@Id
	private Long idprod;

	private String idsetor;

	private String local;

	private String narrativa;

	private String prodcodrep;

	private String proddescrep;

	private String prodnarrarep;

	private String reparo;

	private String serial;

	private String status;

	private String stdef;

	private String un;

	private String usuario;

	public VwTotal() {
	}

	public String getAnadef() {
		return this.anadef;
	}

	public void setAnadef(String anadef) {
		this.anadef = anadef;
	}

	public String getCodbarras() {
		return this.codbarras;
	}

	public void setCodbarras(String codbarras) {
		this.codbarras = codbarras;
	}

	public String getCodbarrasrep() {
		return this.codbarrasrep;
	}

	public void setCodbarrasrep(String codbarrasrep) {
		this.codbarrasrep = codbarrasrep;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDef() {
		return this.def;
	}

	public void setDef(String def) {
		this.def = def;
	}

	public String getDescesp() {
		return this.descesp;
	}

	public void setDescesp(String descesp) {
		this.descesp = descesp;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public Date getDt() {
		return this.dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public Date getDtrep() {
		return this.dtrep;
	}

	public void setDtrep(Date dtrep) {
		this.dtrep = dtrep;
	}

	public String getEan() {
		return this.ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public String getEanrep() {
		return this.eanrep;
	}

	public void setEanrep(String eanrep) {
		this.eanrep = eanrep;
	}

	public String getGrupo() {
		return this.grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getHora() {
		return this.hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getHrrep() {
		return this.hrrep;
	}

	public void setHrrep(String hrrep) {
		this.hrrep = hrrep;
	}

	public Long getIdprod() {
		return this.idprod;
	}

	public void setIdprod(Long idprod) {
		this.idprod = idprod;
	}

	public String getIdsetor() {
		return this.idsetor;
	}

	public void setIdsetor(String idsetor) {
		this.idsetor = idsetor;
	}

	public String getLocal() {
		return this.local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getNarrativa() {
		return this.narrativa;
	}

	public void setNarrativa(String narrativa) {
		this.narrativa = narrativa;
	}

	public String getProdcodrep() {
		return this.prodcodrep;
	}

	public void setProdcodrep(String prodcodrep) {
		this.prodcodrep = prodcodrep;
	}

	public String getProddescrep() {
		return this.proddescrep;
	}

	public void setProddescrep(String proddescrep) {
		this.proddescrep = proddescrep;
	}

	public String getProdnarrarep() {
		return this.prodnarrarep;
	}

	public void setProdnarrarep(String prodnarrarep) {
		this.prodnarrarep = prodnarrarep;
	}

	public String getReparo() {
		return this.reparo;
	}

	public void setReparo(String reparo) {
		this.reparo = reparo;
	}

	public String getSerial() {
		return this.serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStdef() {
		return this.stdef;
	}

	public void setStdef(String stdef) {
		this.stdef = stdef;
	}

	public String getUn() {
		return this.un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}