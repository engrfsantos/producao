package br.com.rfsantos.producao;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Filtro{	
	private Date dt;	
	private Date dtf;
	private String dtS;
	private String dtfS;
	boolean periodoFiltrado;
	boolean temFiltro;
	boolean setorFiltrado;
	boolean usuarioFiltrado;
	
	static DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
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

	public boolean isSetorFiltrado() {
		return setorFiltrado;
	}

	public void setSetorFiltrado(boolean setorFiltrado) {
		this.setorFiltrado = setorFiltrado;
	}

	public boolean isUsuarioFiltrado() {
		return usuarioFiltrado;
	}

	public void setUsuarioFiltrado(boolean usuarioFiltrado) {
		this.usuarioFiltrado = usuarioFiltrado;
	}

	public void setDtS(String dtS) {
		this.dtS = dtS;
	}

	public void setDtfS(String dtfS) {
		this.dtfS = dtfS;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dt == null) ? 0 : dt.hashCode());
		result = prime * result + ((dtS == null) ? 0 : dtS.hashCode());
		result = prime * result + ((dtf == null) ? 0 : dtf.hashCode());
		result = prime * result + ((dtfS == null) ? 0 : dtfS.hashCode());
		result = prime * result + (periodoFiltrado ? 1231 : 1237);
		result = prime * result + (setorFiltrado ? 1231 : 1237);
		result = prime * result + (temFiltro ? 1231 : 1237);
		result = prime * result + (usuarioFiltrado ? 1231 : 1237);
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
		Filtro other = (Filtro) obj;
		if (dt == null) {
			if (other.dt != null)
				return false;
		} else if (!dt.equals(other.dt))
			return false;
		if (dtS == null) {
			if (other.dtS != null)
				return false;
		} else if (!dtS.equals(other.dtS))
			return false;
		if (dtf == null) {
			if (other.dtf != null)
				return false;
		} else if (!dtf.equals(other.dtf))
			return false;
		if (dtfS == null) {
			if (other.dtfS != null)
				return false;
		} else if (!dtfS.equals(other.dtfS))
			return false;
		if (periodoFiltrado != other.periodoFiltrado)
			return false;
		if (setorFiltrado != other.setorFiltrado)
			return false;
		if (temFiltro != other.temFiltro)
			return false;
		if (usuarioFiltrado != other.usuarioFiltrado)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Filtro [dt=" + dt + ", dtf=" + dtf + ", dtS=" + dtS + ", dtfS=" + dtfS + ", periodoFiltrado="
				+ periodoFiltrado + ", temFiltro=" + temFiltro + ", setorFiltrado=" + setorFiltrado
				+ ", usuarioFiltrado=" + usuarioFiltrado + "]";
	}



	
			
	
	
}
