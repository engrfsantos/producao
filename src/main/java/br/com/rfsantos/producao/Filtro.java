package br.com.rfsantos.producao;
import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.time.LocalDate;


public class Filtro{	
	private LocalDate dt;	
	private LocalDate dtf;
	boolean bPeriodo;
	boolean bFiltrado;
	public Filtro(String sDt, String sDtf) {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		if ((sDt==null) & (sDtf==null)) {
			this.bPeriodo = false;		
			this.bFiltrado = false;
			this.dt = LocalDate.now();
			this.dtf = this.dt;}
		
		if ((sDt==null) & (sDtf!=null)) {
			this.bFiltrado = true;
			this.dt = LocalDate.parse(String.format("01/01/1900", formatter));			
			this.dtf = LocalDate.parse(String.format(sDtf, formatter)); }
		
		if ((sDt!=null) & (sDtf==null)) {
			this.bFiltrado = true;
			this.dt = LocalDate.parse(String.format(sDt, formatter));			
			this.dtf = this.dt; }				
		}
	public LocalDate getDt() {
		return dt;
	}
	public void setDt(LocalDate dt) {
		this.dt = dt;
	}
	public LocalDate getDtf() {
		return dtf;
	}
	public void setDtf(LocalDate dtf) {
		this.dtf = dtf;
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
