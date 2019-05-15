package org.formacio.api;

import javax.persistence.*;

/**
 * Introduiu, sense canviar el codi ja existent, les annotacions de mapping necessaries
 * per tal que aquesta classe sigui una entitat mapejada a la taula T_LOCALITATS tal com
 * esta definida a:
 * src/main/resources/schema.sql
 */

@Entity
@Table(name="T_LOCALITATS")
public class Localitat {

	@Id 
	@Column(name="LOC_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="LOC_NOM")
	private String nom;

	@Column(name="LOC_HABS")
	private Integer habitants;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getHabitants() {
		return habitants;
	}
	public void setHabitants(Integer habitants) {
		this.habitants = habitants;
	}
	
	
	
}
