package br.com.moriartynho.apijornadamilhas.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(DepoimentoController.class)
class DepoimentoControllerTest {

	@Autowired
    private MockMvc mockMvc;
	
	@Test
	public void deveRetornarTodasAsRequisicoes() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/depoimentos")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.depoimento").value("List<Depoimento>"));
	}

}
