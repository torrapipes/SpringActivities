package org.lasencinas.setmana_3_practica;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.http.MediaType;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class Tests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void getSayHiMethod() throws Exception {

		this.mockMvc.perform(get("/hello")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(equalTo("Hii")));
	}
	
	
	@Test
    public void getAllTopicsTest() throws Exception {
        mockMvc.perform(get("/topics").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(content().json("[{id : 'spring', name : 'Spring Framework', description : " +
                        "'Spring Framework Description'}, " +
                        "{id : 'java', name : 'Core Java', description : 'Core Java Description'}, " +
                        "{id : 'javascript', 'name' : 'JavaScript', 'description' : 'JavaScript Description'}]"));
    }
	
	

}