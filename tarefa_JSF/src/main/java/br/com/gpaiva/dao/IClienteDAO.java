/**
 * 
 */
package br.com.gpaiva.dao;

import java.util.List;

import br.com.gpaiva.dao.generic.IGenericDAO;
import br.com.gpaiva.domain.Cliente;


public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

	List<Cliente> filtrarClientes(String query);

}
