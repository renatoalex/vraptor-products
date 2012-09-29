package br.gov.taxacao.repositorio;

import org.hibernate.Session;

import br.com.caelum.vraptor.ioc.Component;
import br.gov.taxacao.modelo.Produto;

@Component
public class ProdutoRepositoryImpl
    extends Repository<Produto, Long>
    implements ProdutoRepository {

	ProdutoRepositoryImpl(Session session) {
		super(session);
	}
}
