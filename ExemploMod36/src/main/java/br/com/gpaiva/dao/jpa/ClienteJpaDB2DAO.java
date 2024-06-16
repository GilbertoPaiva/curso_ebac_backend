/**
 * 
 */
package br.com.gpaiva.dao.jpa;

import br.com.gpaiva.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.gpaiva.domain.jpa.ClienteJpa;


public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
