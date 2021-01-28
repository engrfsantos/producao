package br.com.rfsantos.producao.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.rfsantos.producao.domain.Usuario;
import br.com.rfsantos.producao.sevices.UsuarioService;

@RestController
@RequestMapping("/login")
public class LoginResource {

	@Autowired
	private Usuario usuario;
	@Autowired
	private UsuarioService usuarioService;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView("login");
		modelAndView.addObject("usuario", usuario);
		return modelAndView;
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Usuario login(@RequestParam(value="login", required = true) String login,
							 @RequestParam(value="senha", required = true) String senha) {
				
		Usuario usuario = usuarioService.findByLogin(login);
		if (!usuario.equals(null))
			if(usuarioService.setAutenticao(login,senha))
				this.usuario = usuario;
			else
				this.usuario = null;
			
		return this.usuario;
		
	}

}
