package br.com.rfsantos.producao;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.rfsantos.producao.domain.Usuario;


public class Filtro{	
	private Date dt;	
	private Date dtf;
	private String dtS;
	private String dtfS;
	private String local;
	private String identificador;
	private Usuario usuario;
	boolean temFiltro;
	boolean periodoFiltrado;	
	
	static private DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	
	public Filtro() {
	}
	
	public Filtro(String local, Usuario usuario) {
		if (!usuario.equals(null))
			this.usuario=usuario;
		if (!local.equals("") & local!=null)
			this.local = local;
	}
	
	public Filtro(Usuario usuario) {
		if (!usuario.equals(null))
			this.usuario=usuario;
	}
	
	public Filtro(String local) {
		if (!local.equals(""))
			this.local = local;
	}
			
	public Filtro(String sDt, String sDtf) throws ParseException {
		if ((sDt==null | sDt=="") & (sDtf==null | sDtf=="")) {
			sDt = formatter.format(new Date());
			this.periodoFiltrado = false;		
			this.temFiltro = false;
			this.dt = formatter.parse(String.format(sDt, formatter));
			this.dtf = null;
			dtTodtS();
			return;
			}
		
		if ((sDt==null | sDt=="") & (sDtf!=null | sDtf!="")) {
			this.temFiltro = true;
			this.periodoFiltrado = true;
			this.dt =  formatter.parse("01/01/1900"); //LocalDate.parse(String.format("01/01/1900", formatter));			
			this.dtf = formatter.parse(String.format(sDtf, formatter));
			dtTodtS();
			return;
		}
		
		if ((sDt!=null & sDt!="") & (sDtf==null | sDtf=="")) {
			this.temFiltro = true;
			this.periodoFiltrado = false;
			this.dt = formatter.parse(String.format(sDt, formatter));			
			this.dtf = this.dt;
			dtTodtS();			
			return;
		}
		
		if ((sDt!=null & sDt!="") & (sDtf!=null & sDtf!="")) {
			this.temFiltro = true;
			this.periodoFiltrado = true;
			this.dt = formatter.parse(String.format(sDt, formatter));			
			this.dtf = formatter.parse(String.format(sDtf, formatter));	
			dtTodtS();			
			return;
		}
			
		}
	
		private void dtTodtS() {
		if (dt!=null)
			this.dtS = formatter.format(this.dt);
		else
			this.dtS = "";
		
		if (dtf!=null)
			this.dtfS = formatter.format(this.dtf);
		else
			this.dtfS = "";
		
	}
	
	public Date getDt() {		
		return dt;
	}	
	public String getDtS() {		
		return this.dtS;
	}	
	public void setDt(Date dt) {				
		this.dt = dt;
	}
	
	public Date getDtf() {
		return dtf;
	}
	public void setDtf(Date dtf) {
		this.dtf = dtf;
	}
	public String getDtfS() {		 
		return this.dtfS;
	}
	public boolean isbPeriodo() {
		return periodoFiltrado;
	}
	public void setbPeriodo(boolean bPeriodo) {
		this.periodoFiltrado = bPeriodo;
	}
	public boolean isbFiltrado() {
		return temFiltro;
	}
	public void setbFiltrado(boolean bFiltrado) {
		this.temFiltro = bFiltrado;
	}

	public boolean isPeriodoFiltrado() {
		return periodoFiltrado;
	}

	public void setPeriodoFiltrado(boolean periodoFiltrado) {
		this.periodoFiltrado = periodoFiltrado;
	}

	public boolean isTemFiltro() {
		return temFiltro;
	}

	public void setTemFiltro(boolean temFiltro) {
		this.temFiltro = temFiltro;
	}

	public void setDtS(String dtS) {
		this.dtS = dtS;
	}

	public void setDtfS(String dtfS) {
		this.dtfS = dtfS;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;		
	}

	public String getIdentificador() {
		return this.identificador;
	}



	
			
	
	
}
