package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {

	@Id
	private Long id;
	private String nom;
	
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
}
