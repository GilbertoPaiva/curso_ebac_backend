package br.com.gpaiva.dao;

import br.com.gpaiva.domain.Livro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LivroDao implements ILivroDao{
    @Override
    public Livro cadastrar(Livro livro) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(livro);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return livro;
    }

    @Override
    public boolean excluir(Long id) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        Livro livro = entityManager.find(Livro.class, id);

        entityManager.remove(livro);
        entityManager.getTransaction().commit();
        entityManagerFactory.close();
        return true;
    }

}
