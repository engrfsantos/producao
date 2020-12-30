package br.com.rfsantos.producao;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Filtro{	
	private Date dt;	
	private Date dtf;
	private String sDt;
	private String sDtf;
	boolean bPeriodo;
	boolean bFiltrado;	
	DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
	public Filtro(String sDt, String sDtf) throws ParseException {
		if ((sDt==null) & (sDtf==null)) {
			sDt = formatter.format(new Date());
			this.bPeriodo = false;		
			this.bFiltrado = false;
			this.dt = formatter.parse(String.format(sDt, formatter));
			this.dtf = null;
			this.sDt = sDt;
			this.sDtf = "";
			return;
			}
		
		if ((sDt==null) & (sDtf!=null)) {
			this.bFiltrado = true;
			this.bPeriodo = true;
			this.dt =  formatter.parse("01/01/1900"); //LocalDate.parse(String.format("01/01/1900", formatter));			
			this.dtf = formatter.parse(String.format(sDtf, formatter));
			this.sDt = "01/01/1900";
			this.sDtf = sDtf;
			return;
		}
		
		if ((sDt!=null) & (sDtf==null)) {
			this.bFiltrado = true;
			this.bPeriodo = false;
			this.dt = formatter.parse(String.format(sDt, formatter));			
			this.dtf = this.dt; 
			this.sDt = sDt;
			this.sDtf = sDt;
			return;
		}
		
		if ((sDt!=null) & (sDtf!=null)) {
			this.bFiltrado = true;
			this.bPeriodo = true;
			this.dt = formatter.parse(String.format(sDt, formatter));			
			this.dtf = formatter.parse(String.format(sDtf, formatter)); 
			this.sDt = sDt;
			this.sDtf = sDtf;
			return;
		}
		
		}
	
	public Date getDt() {
		return dt;
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
	public String getsDt() {
		return sDt;
	}

	public void setsDt(String sDt) {
		this.sDt = sDt;
	}

	public String getsDtf() {
		return sDtf;
	}

	public void setsDtf(String sDtf) {
		this.sDtf = sDtf;
	}

	public boolean isbPeriodo() {
		return bPeriodo;
	}
	public void setbPeriodo(boolean bPeriodo) {
		this.bPeriodo = bPeriodo;
	}
	public boolean isbFiltrado() {
		return bFiltrado;
	}
	public void setbFiltrado(boolean bFiltrado) {
		this.bFiltrado = bFiltrado;
	}
	@Override
	public String toString() {
		return "Filtro [dt=" + dt + ", dtf=" + dtf + ", bPeriodo=" + bPeriodo + "]";
	}
			
	
	
}
