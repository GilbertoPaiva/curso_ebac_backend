package br.com.gpaiva.dao;

import br.com.gpaiva.domain.Carro;
import br.com.gpaiva.domain.Marca;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class CarroDao implements ICarroDao {
    @Override
    public Carro cadastrar(Carro carro) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(carro);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return carro;
    }

    public Carro buscarPorCodigoMarca(String codigoMarca){
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StringBuilder sb = new StringBuilder();
        sb.append("SELECT c FROM Carro c ");
        sb.append("INNER JOIN Marca m on m = c.marca ");
        sb.append("Where m.codigo = :codigoMarca");

        entityManager.getTransaction().begin();
        TypedQuery<Carro> query =
                entityManager.createQuery(sb.toString(), Carro.class);
        query.setParameter("codigoMarca", codigoMarca);
        Carro carro = query.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return carro;
    }

    public Carro buscarPorMarca(Marca marca){
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StringBuilder sb = new StringBuilder();
        sb.append("SELECT c FROM Carro c ");
        sb.append("INNER JOIN Marca m on m = c.marca ");
        sb.append("Where m = :marca");

        entityManager.getTransaction().begin();
        TypedQuery<Carro> query =
                entityManager.createQuery(sb.toString(), Carro.class);
        query.setParameter("marca", marca);
        Carro carro = query.getSingleResult();

        entityManager.close();
        entityManagerFactory.close();

        return carro;
    }
}
