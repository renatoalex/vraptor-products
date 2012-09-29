package br.gov.taxacao.repositorio;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ProdutoRepositoryImplTest {

    @Test public void fakeTest() {
  		assertNotNull("put something real.", new ProdutoRepositoryImpl(null));
  	}
}

