package org.formacio.component;

import javax.annotation.PostConstruct;

import org.formacio.mvc.Controlador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class ServeiAlumnat implements Controlador {

	
	@Autowired
	private RepositoriAlumnesMemoria repositori;
	
	
	@PostConstruct
	public void init() {
		
		this.repositori.altaAlumne(1, "Antonia");
		this.repositori.altaAlumne(2, "Joan");
		
	}
	
	
	/**
	 * ha de donar d'alta a la base de dades d'alumnes l'alumne indicat amb 
	 * el corresponent codi.
	 * Si el nom de l'alumne es null, no l'ha de donar d'alta
	 * Retorna true si l'alumne s'ha inserit, false si no.
	 */
	public boolean matricula (int id, String alumne) {
		
		
		if(alumne == null) {
			
			return false;
			
		}else {
			
			repositori.altaAlumne(id, alumne);
			return true;
			
		}
		
	}

	
	@Override
	@RequestMapping("/alumnes")
	public int nombreAlumnes(ServeiAlumnat servei) {
		
		return repositori.llistaAlumnes().size();
		
	}
	

}
