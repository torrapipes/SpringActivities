package org.lasencinas.setmana_3_practica;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@RequestMapping(path="/hello")
	public String sayHi() {
		return "Hii";
	}
	
	

}
