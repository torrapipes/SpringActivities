package org.formacio.mvc;

import org.formacio.repositori.AgendaService;
import org.formacio.repositori.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controlador {

	
	@Autowired
	AgendaService agend;
	Persona pers;
	
	@RequestMapping(path="/nombre")
	@ResponseBody
	public int nombrePersones() {
		return agend.nombreContactes();
	}
	
	
	@RequestMapping(path="/telefon")
	@ResponseBody
	public String getNumeroTelefon(@RequestParam(name="id", required=true, defaultValue="ant") String id) {
		return agend.recupera(id).getTelefon();
	}
	
	
	
	
}
