/**
 * 
 */
package br.com.gpaiva.dao;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.persistence.TypedQuery;

import br.com.gpaiva.dao.generic.GenericDAO;
import br.com.gpaiva.domain.Cliente;

@ApplicationScoped
public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

	@Override
	public List<Cliente> filtrarClientes(String query) {
		TypedQuery<Cliente> tpQuery = 
				this.entityManager.createNamedQuery("Cliente.findByNome", this.persistenteClass);
		tpQuery.setParameter("nome", "%" + query + "%");
        return tpQuery.getResultList();
		
	}

}
