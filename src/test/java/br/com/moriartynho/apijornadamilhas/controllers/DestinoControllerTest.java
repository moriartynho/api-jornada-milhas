package br.com.moriartynho.apijornadamilhas.controllers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import br.com.moriartynho.apijornadamilhas.models.Destino;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
class DestinoControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private JacksonTester<Destino> destinoJsonPost;

	@Test
	public void deveRetornarTodosOsDestinos() throws Exception {
		var response = mockMvc.perform(get("/destinos")).andReturn().getResponse();

		assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
	}

	@Test
	public void deveRetornarUmDestino() throws Exception {
		var response = mockMvc.perform(get("/destinos/1")).andReturn().getResponse();

		assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
	}

	@Test
	public void devePostarUmDestino() throws Exception {

		var response = mockMvc.perform(post("/destinos").contentType(MediaType.APPLICATION_JSON).content(destinoJsonPost
				.write(new Destino(20L, null, null, "Itapevi", new BigDecimal("250.00"), null, null)).getJson()))
				.andReturn().getResponse();

		assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());

	}

	@Test
	public void deveDeletarUmDestino() throws Exception {
		var response = mockMvc.perform(delete("/destinos/1").contentType(MediaType.APPLICATION_JSON)).andReturn()
				.getResponse();

		assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
	}

	@Test
	public void deveEditarUmDestino() throws Exception {
		var response = mockMvc.perform(put("/destinos/1").contentType(MediaType.APPLICATION_JSON)
				.content(destinoJsonPost
						.write(new Destino(null, null, null, "Osasco", new BigDecimal("250.00"), null, null))
						.getJson()))
				.andReturn().getResponse();

		assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
	}

}
