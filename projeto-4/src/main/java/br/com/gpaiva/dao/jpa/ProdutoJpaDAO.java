
package br.com.gpaiva.dao.jpa;

import br.com.gpaiva.dao.generic.jpa.GenericJpaDAO;
import br.com.gpaiva.domain.jpa.ProdutoJpa;


public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
