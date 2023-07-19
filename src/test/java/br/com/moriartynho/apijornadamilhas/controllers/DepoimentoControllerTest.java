package br.com.moriartynho.apijornadamilhas.controllers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import br.com.moriartynho.apijornadamilhas.models.Depoimento;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
class DepoimentoControllerTest {

	@Autowired
	private MockMvc mockMvc;
	

	@Autowired
	private JacksonTester<Depoimento> depoimentoJsonPost;


	@Test
	public void deveRetornarTodosOsDepoimentos() throws Exception {
		var response = mockMvc.perform(get("/depoimentos")).andReturn().getResponse();

		assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
	}

	@Test
	public void deveRetornarUmDepoimento() throws Exception {
		var response = mockMvc.perform(get("/depoimentos/1")).andReturn().getResponse();

		assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
	}

	@Test
	public void devePostarUmDepoimento() throws Exception {
		
		
		var response = mockMvc
				.perform(post("/depoimentos")
						.contentType(MediaType.APPLICATION_JSON)
						.content(depoimentoJsonPost
						.write(new Depoimento(10L, "Incrível", null, "Wilkson"))
						.getJson()))
				.andReturn().getResponse();


		assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());

	}
	
	@Test
	public void deveDeletarUmDepoimento() throws Exception {
		var response = mockMvc.perform(delete("/depoimentos/1")
				.contentType(MediaType.APPLICATION_JSON)).andReturn().getResponse();

		assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
	}
	
	@Test
	public void deveEditarUmDepoimento() throws Exception {
		var response = mockMvc.perform(put("/depoimentos/1")
				.contentType(MediaType.APPLICATION_JSON)
				.content(depoimentoJsonPost
						.write(new Depoimento(null, "Incrível", null, "Wilkson"))
						.getJson()))
				.andReturn().getResponse();

		assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
	}

}
