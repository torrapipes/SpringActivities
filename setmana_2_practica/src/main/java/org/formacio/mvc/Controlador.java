package org.formacio.mvc;

//import java.awt.PageAttributes.MediaType;
import org.springframework.http.MediaType;

import javax.xml.bind.annotation.XmlRootElement;

import org.formacio.repositori.AgendaService;
import org.formacio.repositori.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@XmlRootElement
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
	public String recuperaNumeroTelefon(@RequestParam(name="id", required=true, defaultValue="ant") String id) {
		return agend.recupera(id).getTelefon();
	}
	

	@RequestMapping(path="/contacte/{id}")
	@ResponseBody
	public Persona recuperaPersona(@PathVariable String id) {
		return agend.recupera(id);
	}
	
	
	
	
	
}
