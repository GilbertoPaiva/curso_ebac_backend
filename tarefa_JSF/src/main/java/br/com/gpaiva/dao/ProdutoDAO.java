/**
 * 
 */
package br.com.gpaiva.dao;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.persistence.TypedQuery;

import br.com.gpaiva.dao.generic.GenericDAO;
import br.com.gpaiva.domain.Produto;

@ApplicationScoped
public class ProdutoDAO extends GenericDAO<Produto, String> implements IProdutoDAO {

	public ProdutoDAO() {
		super(Produto.class);
	}

	@Override
	public List<Produto> filtrarProdutos(String query) {
		TypedQuery<Produto> tpQuery = 
				this.entityManager.createNamedQuery("Produto.findByNome", this.persistenteClass);
		tpQuery.setParameter("nome", "%" + query + "%");
        return tpQuery.getResultList();
	}

}
