package org.formacio.api;

import javax.persistence.*;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

/**
 * Modifica aquesta classe per tal que sigui un component Spring que realitza les 
 * operacions de persistencia tal com indiquen les firmes dels metodes
 */

@Component
public class LocalitatOpBasic {
	
	@PersistenceContext
	private EntityManager em;
	
	public Localitat carrega (long id) {
		return em.find(Localitat.class, id);
	}
	
	
	@Transactional
	public void alta (String nom, Integer habitants) {
		Localitat loc = new Localitat();
		loc.setHabitants(habitants);
		loc.setNom(nom);
		em.persist(loc);
	}
	
	public void elimina (long id) {
	}
	
	public void modifica (Localitat localitat) {
	}

}
