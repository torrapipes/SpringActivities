package org.formacio.setmana2.servei;

import java.util.ArrayList;
import java.util.List;

import org.formacio.setmana2.domini.Matricula;
import org.formacio.setmana2.repositori.EdatIncorrecteException;
import org.formacio.setmana2.repositori.RepositoriEscola;
import org.springframework.stereotype.Service;

@Service
public class ServeiEscola {

	
	/**
	 * Important: els alumnes i els cursos indicats JA existeixen a la base de dades.
	 * Per tant, els hem de carregar, no crear de nou.
	 * L'excepcio EdatIncorrecteException no s'ha de capturar. S'ha de propagar cap el client
	 */
	public List<Matricula> apunta (String curs, List<String> alumnes) throws EdatIncorrecteException {
		RepositoriEscola repo = new RepositoriEscola();
		List<Matricula> listaMat = new ArrayList<Matricula>();
		for (String alumne : alumnes) {
			listaMat.add(repo.apunta(alumne, curs));
		}
		return listaMat;
    }
}
