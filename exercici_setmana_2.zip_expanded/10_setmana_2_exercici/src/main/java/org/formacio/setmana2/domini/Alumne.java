package org.formacio.setmana2.domini;

import javax.persistence.*;

@Entity
@Table(name="t_alumnes")
public class Alumne {

	@Id
	@Column(name="alu_nom")
	private String nom;
	
	@Column(name="alu_edat")
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Alumne))
			return false;
		Alumne other = (Alumne) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}
	
	
	
	
	
	
	
}
