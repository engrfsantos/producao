package br.com.rfsantos.producao;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.rfsantos.producao.domain.Usuario;
import br.com.rfsantos.producao.sevices.UsuarioService;


public class Filtro{	
	private LocalDate dt;	
	private LocalDate dtf;
	
	private String dtS;
	private String dtfS;
	private String setorId;
	private String postoId;
	private Usuario usuarioId;
	boolean temFiltro;
	boolean periodoFiltrado;	
	
	@Autowired
	private UsuarioService usuarioService;
	
	static private DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	//static private DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	public Filtro() {
	}
	
	public Filtro(String setor, Usuario usuario, String posto) {
		if (!usuario.equals(null))
			this.usuarioId=usuario;
		if (!setor.equals("") & setor!=null)
			this.setorId = setor;
		if (!posto.equals("") & (posto!=null))
			this.postoId = posto;
	}
	
	
	public Filtro(String setor, Usuario usuario) {
		if (!usuario.equals(null))
			this.usuarioId=usuario;
		if (!setor.equals("") & setor!=null)
			this.setorId = setor;
	}
	
	public Filtro(Usuario usuario) {
		if (!usuario.equals(null))
			this.usuarioId=usuario;
	}
	
	public Filtro(String setor) {
		if (!setor.equals(""))
			this.setorId = setor;
	}
			
	public Filtro(String sDt, String sDtf) throws ParseException {
		if ((sDt==null | sDt=="") & (sDtf==null | sDtf=="")) {
			sDt = formatter.format(LocalDate.now());
			this.periodoFiltrado = false;		
			this.temFiltro = false;
			this.dt = LocalDate.parse(String.format(sDt, formatter));
			this.dtf = null;
			dtTodtS();
			return;
			}
		
		if ((sDt==null | sDt=="") & (sDtf!=null | sDtf!="")) {
			this.temFiltro = true;
			this.periodoFiltrado = true;
			this.dt =  LocalDate.parse("01/01/1900"); //LocalDate.parse(String.format("01/01/1900", formatter));			
			this.dtf = LocalDate.parse(String.format(sDtf, formatter));
			dtTodtS();
			return;
		}
		
		if ((sDt!=null & sDt!="") & (sDtf==null | sDtf=="")) {
			this.temFiltro = true;
			this.periodoFiltrado = false;
			this.dt = LocalDate.parse(String.format(sDt, formatter));			
			this.dtf = this.dt;
			dtTodtS();			
			return;
		}
		
		if ((sDt!=null & sDt!="") & (sDtf!=null & sDtf!="")) {
			this.temFiltro = true;
			this.periodoFiltrado = true;
			this.dt = LocalDate.parse(String.format(sDt, formatter));			
			this.dtf = LocalDate.parse(String.format(sDtf, formatter));	
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
	
	public LocalDate getDt() {		
		return dt;
	}	
	public String getDtS() {		
		return this.dtS;
	}	
	public void setDt(LocalDate dt) {				
		this.dt = dt;
		this.dtS =  formatter.format(this.dt);
	}
	
	public LocalDate getDtf() {
		return dtf;
	}
	public void setDtf(LocalDate dtf) {
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

	public void setDtS(String dtS) throws ParseException {
		this.dtS = dtS;
		this.dt = LocalDate.parse(String.format(dtS, formatter));
	}

	public void setDtfS(String dtfS) {
		this.dtfS = dtfS;
	}

	public String getSetor() {
		return setorId;
	}

	public void setSetor(String setor) {
		this.setorId = setor;
	}

	public Usuario getUsuario() {
		return usuarioId;
	}

	public void setUsuario(Usuario usuario) {
		this.usuarioId = usuario;
	}

	public void setPosto(String posto) {
		this.postoId = posto;		
	}

	public String getPosto() {
		return this.postoId;
	}

	public void setUsuarioRe(String re) {
		this.usuarioId = usuarioService.findById(re);		
	}

	

	
			
	
	
}
