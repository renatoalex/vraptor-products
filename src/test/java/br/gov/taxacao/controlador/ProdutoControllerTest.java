package br.gov.taxacao.controlador;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ProdutoControllerTest {

	@Test public void fakeTest() {
		assertNotNull("put something real.", new ProdutoController(null, null, null));
 	}
}
