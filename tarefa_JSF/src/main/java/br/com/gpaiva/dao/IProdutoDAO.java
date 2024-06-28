/**
 * 
 */
package br.com.gpaiva.dao;

import java.util.List;

import br.com.gpaiva.dao.generic.IGenericDAO;
import br.com.gpaiva.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
