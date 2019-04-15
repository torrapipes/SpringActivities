package org.formacio.component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * A part del que sigui necessari per fer d'aquesta classe un component, no s'ha de 
 * modificar res mes d'aquesta classe
 */
public class RepositoriAlumnesMemoria implements RepositoriAlumnes {

	private Map<Integer, String> bbdd = new HashMap<>();
	
	@Override
	public String obteAlumne(int id) {
		return bbdd.get(id);
	}

	@Override
	public void altaAlumne(int id, String nom) {
		bbdd.put(id,  nom);
	}

	@Override
	public Collection<String> llistaAlumnes() {
		return bbdd.values();
	}

}
