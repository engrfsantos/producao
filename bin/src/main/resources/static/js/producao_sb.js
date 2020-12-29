$(document).ready(function(){
        
	
$('#inputLeitura').on('blur', function(){
	 //validar a leitura	 
	});    
});


$(function(){
	$("#dataunica").datepicker({    	
		showOn: 'button',
        //buttonImage: 'img/calendar.jpg',
        //buttonImageOnly: false,
        showButtonPanel:true,
        changeMonth: true,
        changeYear: true,
        dateFormat: 'dd/mm/yy',
        dayNames: ['Domingo','Segunda','Terça','Quarta','Quinta','Sexta','Sábado','Domingo'],
        dayNamesMin: ['D','S','T','Q','Q','S','S','D'],
        dayNamesShort: ['Dom','Seg','Ter','Qua','Qui','Sex','Sáb','Dom'],
        monthNames: ['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro','Outubro','Novembro','Dezembro'],
        monthNamesShort: ['Jan','Fev','Mar','Abr','Mai','Jun','Jul','Ago','Set','Out','Nov','Dez']
	});

	
$(function(){
	$("#datainicio").datepicker({    	
		showOn: 'button',
        //buttonImage: 'img/calendar.png',
        //buttonImageOnly: false,
        showButtonPanel:true,
        changeMonth: true,
        changeYear: true,
        dateFormat: 'dd/mm/yy',
        dayNames: ['Domingo','Segunda','Terça','Quarta','Quinta','Sexta','Sábado','Domingo'],
        dayNamesMin: ['D','S','T','Q','Q','S','S','D'],
        dayNamesShort: ['Dom','Seg','Ter','Qua','Qui','Sex','Sáb','Dom'],
        monthNames: ['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro','Outubro','Novembro','Dezembro'],
        monthNamesShort: ['Jan','Fev','Mar','Abr','Mai','Jun','Jul','Ago','Set','Out','Nov','Dez']
	});

	
$(function(){
	$("#datafinal").datepicker({    	
		showOn: 'button',
        //buttonImage: 'img/calendar.png',
        //buttonImageOnly: false,
        showButtonPanel:true,
        changeMonth: true,
        changeYear: true,
        dateFormat: 'dd/mm/yy',
        dayNames: ['Domingo','Segunda','Terça','Quarta','Quinta','Sexta','Sábado','Domingo'],
        dayNamesMin: ['D','S','T','Q','Q','S','S','D'],
        dayNamesShort: ['Dom','Seg','Ter','Qua','Qui','Sex','Sáb','Dom'],
        monthNames: ['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro','Outubro','Novembro','Dezembro'],
        monthNamesShort: ['Jan','Fev','Mar','Abr','Mai','Jun','Jul','Ago','Set','Out','Nov','Dez']
		});		
	});	
});

$(function(){
	$("#btData").click(function(){
	$("#dataunica").val(dataHoje()) ;	
	$("#datainicio").visible = false;	
	$("#datafinal").visible = false;
	$("#datainicio").val("Inicio");
	$("#datafinal").val("Final");
	});
});

$(function(){
	$("#btSemana").click(function(){	
	$("#datainicio").val(dataPrimeiroDiaSemana()) ;	
	$("#datafinal").val(dataUltimoDiaSemana()) ;	
	$("#dataunica").val("Data") ;
	});
});

$(function(){
	$("#btMes").click(function(){	
	$("#datainicio").val(dataPrimeiroDiaMes());
	$("#datafinal").val(dataUltimoDiaMes());	
	$("#dataunica").visible = false;
	$("#dataunica").val("Data");
	});
});

function dataHoje() {
    var data = new Date(),
        dia = data.getDate(),
        mes = data.getMonth() + 1,
        ano = data.getFullYear();        
    return [dia, mes, ano].join('/') ;
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
    return [dia, mes, ano].join('/');
	};

function dataUltimoDiaSemana() {
    var data = segundaFeira(new Date()),
        dia = data.getDate()+7,
        mes = data.getMonth() + 1,
        ano = data.getFullYear();        
    return [dia, mes, ano].join('/');
	};

function dataPrimeiroDiaMes() {    
	var date = new Date(), 
		primeiroDia = new Date(date.getFullYear(), date.getMonth(), 1),        
		dia = primeiroDia.getDate(),
        mes = primeiroDia.getMonth() + 1,
        ano = primeiroDia.getFullYear();  
    return [dia, mes, ano].join('/');
	};

function dataUltimoDiaMes() {
    var date = new Date(),
    	ultimoDia = new Date(date.getFullYear(), date.getMonth() + 1, 0);   
    	dia = ultimoDia.getDate(),
        mes = ultimoDia.getMonth() + 1,
        ano = ultimoDia.getFullYear();  
    return [dia, mes, ano].join('/');     
	};
	
function segundaFeira(date) {
    var day = date.getDay() || 7;  
    if( day !== 1 ) 
        date.setHours(-24 * (day - 1)); 
    return date;
}

	
});

