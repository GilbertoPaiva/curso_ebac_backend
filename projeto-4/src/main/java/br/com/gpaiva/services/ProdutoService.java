
package br.com.gpaiva.services;

import br.com.gpaiva.services.generic.GenericService;
import br.com.gpaiva.dao.IProdutoDAO;
import br.com.gpaiva.domain.Produto;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
