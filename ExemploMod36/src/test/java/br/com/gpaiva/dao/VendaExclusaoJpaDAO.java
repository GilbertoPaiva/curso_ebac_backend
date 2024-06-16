/**
 * 
 */
package br.com.gpaiva.dao;

import br.com.gpaiva.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.gpaiva.dao.jpa.IVendaJpaDAO;
import br.com.gpaiva.domain.jpa.VendaJpa;
import br.com.gpaiva.exceptions.DAOException;
import br.com.gpaiva.exceptions.TipoChaveNaoEncontradaException;

/*
 * Classe utilizada somente no teste para fazer a exclusão das vendas
 *
 */
public class VendaExclusaoJpaDAO extends GenericJpaDB1DAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
