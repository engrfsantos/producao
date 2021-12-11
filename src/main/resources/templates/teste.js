$(document).ready(function(){


$(function() {
	$("#defeitoi").change(function() {
		
	var defeitoi = document.getElementById("defeitoi");
	alert(defeitoi.value);	
	var defeitol = document.getElementById("defeitol");
	alert(defeitol.value);
	
	var options = defeitol.options;
        
    for(var i = 0; i < options.length;i++){
          
		  if (options[i].value == defeitoi.value){
			alert(options[i].value);
			alert(options[i].id);		 

		 }
		  
			  
	}
	
	
  })
 });

	
});

