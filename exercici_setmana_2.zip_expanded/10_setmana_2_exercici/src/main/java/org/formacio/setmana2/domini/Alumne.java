package org.formacio.setmana2.domini;

import javax.persistence.*;

@Table(name="t_alumnes")
public class Alumne {

	private String nom;
	
	private int edat;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getEdat() {
		return edat;
	}
	public void setEdat(int edat) {
		this.edat = edat;
	}
	
}
