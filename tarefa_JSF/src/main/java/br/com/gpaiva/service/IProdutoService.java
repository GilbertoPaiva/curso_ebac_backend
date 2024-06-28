/**
 * 
 */
package br.com.gpaiva.service;

import java.util.List;

import br.com.gpaiva.services.generic.IGenericService;
import br.com.gpaiva.domain.Produto;


public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
