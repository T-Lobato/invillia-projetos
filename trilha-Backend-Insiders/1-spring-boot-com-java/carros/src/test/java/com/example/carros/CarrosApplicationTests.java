package com.example.carros;

import com.example.carros.domain.Carro;
import com.example.carros.domain.CarroService;
import com.example.carros.domain.dto.CarroDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarrosApplicationTests {

	@Autowired
	private CarroService service;

	@Test
	void testSave() {

		Carro carro = new Carro();
		carro.setNome("Porshe");
		carro.setTipo("esportivos");

		CarroDTO c = service.insert(carro);

		assertNotNull(c);

		Long id = c.getId();
		assertNotNull(id);

		// Buscar o objeto
		Optional<CarroDTO> op = service.getCarroById(id);
		assertTrue(op.isPresent());

		c = op.get();
		assertEquals("Porshe", c.getNome());
		assertEquals("esportivos", c.getTipo());

		// Deletar o objeto
		service.delete(id);

		// Verificar se deletou
		assertFalse(service.getCarroById(id).isPresent());
	}

	@Test
	public void testLista() {
		List<CarroDTO> carros = service.getCarros();

		assertEquals(30, carros.size());
	}

	@Test
	public void testListaPorTipo() {

		assertEquals(10,service.getCarrosByTipo("classicos").size());
		assertEquals(10,service.getCarrosByTipo("esportivos").size());
		assertEquals(10,service.getCarrosByTipo("luxo").size());

		assertEquals(0,service.getCarrosByTipo("x").size());


	}

	@Test
	public void testGet() {

		Optional<CarroDTO> op = service.getCarroById(11L);
		assertTrue(op.isPresent());
		CarroDTO c = op.get();
		assertEquals("Ferrari FF", c.getNome());
	}


}