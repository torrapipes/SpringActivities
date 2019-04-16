package org.formacio.mvc;

import org.formacio.component.ServeiAlumnat;
import org.springframework.stereotype.Controller;

@Controller
public interface Controlador {

	int nombreAlumnes(ServeiAlumnat servei);
	
}
