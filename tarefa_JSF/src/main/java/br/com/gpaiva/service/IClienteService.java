/**
 * 
 */
package br.com.gpaiva.service;

import java.util.List;

import br.com.gpaiva.exceptions.DAOException;
import br.com.gpaiva.services.generic.IGenericService;
import br.com.gpaiva.domain.Cliente;


public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
