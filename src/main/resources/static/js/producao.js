$(document).ready(function(){

$(function(){
	$("#frmProdDefeito").submit(function(){
	var defeitoi = document.getElementById("defeitoi");
	alert(defeitoi.value);	
	var defeitol = document.getElementById("defeitol");
	alert(defeitol.value);	
	var options = defeitol.options;        
    for(var i = 0; i < options.length;i++){          
		  if (options[i].value == defeitoi.value){
			alert(options[i].value);
			alert(options[i].id);
			defeitoi.value = options[i].id;		 
		 }		  		  
	}
	
	var condicaoi = document.getElementById("condicaoi");
	alert(condicaoi.value);	
	var condicaol = document.getElementById("condicaol");
	alert(condicaol.value);	
	var options = condicaol.options;        
    for(var i = 0; i < options.length;i++){          
		  if (options[i].value == condicaoi.value){
			alert(options[i].value);
			alert(options[i].id);
			condicaoi.value = options[i].id;		 
		 }		  		  
	}
	
	
	
	
	
	
			
})
}
)

$(function(){
	$("#dt").datepicker({    	
        dateFormat: 'yy-mm-dd',
        changeMonth: true,
        changeYear: true,
        dayNames: ['Domingo','Segunda','Terça','Quarta','Quinta','Sexta','Sábado','Domingo'],
        dayNamesMin: ['D','S','T','Q','Q','S','S','D'],
        dayNamesShort: ['Dom','Seg','Ter','Qua','Qui','Sex','Sáb','Dom'],
        monthNames: ['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro','Outubro','Novembro','Dezembro'],
        monthNamesShort: ['Jan','Fev','Mar','Abr','Mai','Jun','Jul','Ago','Set','Out','Nov','Dez']
	});
});

$(function(){
	$("#dtf").datepicker({    	
        dateFormat: 'yy-mm-dd',
        changeMonth: true,
        changeYear: true,
        dayNames: ['Domingo','Segunda','Terça','Quarta','Quinta','Sexta','Sábado','Domingo'],
        dayNamesMin: ['D','S','T','Q','Q','S','S','D'],
        dayNamesShort: ['Dom','Seg','Ter','Qua','Qui','Sex','Sáb','Dom'],
        monthNames: ['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro','Outubro','Novembro','Dezembro'],
        monthNamesShort: ['Jan','Fev','Mar','Abr','Mai','Jun','Jul','Ago','Set','Out','Nov','Dez']
		});		
	});	

$(function(){
	$("#btData").click(function(){
	$("#dt").val(dataHoje()) ;	
	$("#dtf").val("");
	$("#dtf").hide();	
	});
});

$(function(){
	$("#btSemana").click(function(){	
	$("#dt").val(dataPrimeiroDiaSemana()) ;	
	$("#dtf").val(dataUltimoDiaSemana()) ;
	$("#dtf").show();		
	});
});

$(function(){
	$("#btMes").click(function(){	
	$("#dt").val(dataPrimeiroDiaMes());
	$("#dtf").val(dataUltimoDiaMes());
	$("#dtf").show();	
	});
});

$(function(){
	$("#btX").click(function(){	
	$("#dt").val("");
	$("#dtf").val("");	
	$("#dtf").hide();	
	});
});

$(function(){
	$("#submit").click(function(){
	if ($("#dt").val() = "") {
		$("#dt").name = "";
	}else{
		$("#dt").name = "dt";}
	
	if ($("#dtf").val() = "") {
		$("#dtf").name = "";
	}else{
		$("#dtf").name = "dtf";
	}

	});
});

function dataHoje() {
    var data = new Date(),
        dia = data.getDate(),
        mes = data.getMonth() + 1,
        ano = data.getFullYear();        
	return [ano, mes, dia].join('-') ;
	};

function dataHoraHoje() {
    var data = new Date(),
        dia = data.getDate(),
        mes = data.getMonth() + 1,
        ano = data.getFullYear(),
        hora = data.getHours(),
        minutos = data.getMinutes(),
        segundos = data.getSeconds();
    return [dia, mes, ano].join('/') + ' ' + [hora, minutos, segundos].join(':');
	};

function dataPrimeiroDiaSemana() {
    var data = segundaFeira(new Date()),
        dia = data.getDate(),
        mes = data.getMonth() + 1,
        ano = data.getFullYear();        
	return [ano, mes, dia].join('-') ;
	
	};

function dataUltimoDiaSemana() {
    var data = segundaFeira(new Date()),
        dia = data.getDate()+7,
        mes = data.getMonth() + 1,
        ano = data.getFullYear();        
    //return [dia, mes, ano].join('/');
	return [ano, mes, dia].join('-') ;
	
	};

function dataPrimeiroDiaMes() {    
	var date = new Date(), 
		primeiroDia = new Date(date.getFullYear(), date.getMonth(), 1),        
		dia = primeiroDia.getDate(),
        mes = primeiroDia.getMonth() + 1,
        ano = primeiroDia.getFullYear();  
 	return [ano, mes, dia].join('-') ;
	
	};

function dataUltimoDiaMes() {
    var date = new Date(),
    	ultimoDia = new Date(date.getFullYear(), date.getMonth() + 1, 0);   
    	dia = ultimoDia.getDate(),
        mes = ultimoDia.getMonth() + 1,
        ano = ultimoDia.getFullYear();  
 	return [ano, mes, dia].join('-') ;  
	};
	
function segundaFeira(date) {
    var day = date.getDay() || 7;  
    if( day !== 1 ) 
        date.setHours(-24 * (day - 1)); 
    return date;
}

	
});

