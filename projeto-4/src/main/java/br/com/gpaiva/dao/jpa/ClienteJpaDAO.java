
package br.com.gpaiva.dao.jpa;

import br.com.gpaiva.dao.generic.jpa.GenericJpaDAO;
import br.com.gpaiva.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
