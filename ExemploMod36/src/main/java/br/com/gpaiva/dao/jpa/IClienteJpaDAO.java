/**
 * 
 */
package br.com.gpaiva.dao.jpa;

import br.com.gpaiva.dao.generic.jpa.IGenericJapDAO;
import br.com.gpaiva.domain.jpa.Persistente;


public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long> {

}
