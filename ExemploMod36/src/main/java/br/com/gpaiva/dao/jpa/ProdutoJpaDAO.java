/**
 * 
 */
package br.com.gpaiva.dao.jpa;

import br.com.gpaiva.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.gpaiva.domain.jpa.ProdutoJpa;


public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
