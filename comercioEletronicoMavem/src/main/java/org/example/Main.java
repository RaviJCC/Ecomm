package org.example;

import pessoas.Pessoa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(null, "Pedro Gomes", "Pedrogomes@gmial.com");
        Pessoa p2 = new Pessoa(null, "Jao Gomes", "Jaogomes@gmial.com");


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ecommerce-maven");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.getTransaction().commit();
        System.out.println("cabo");

        System.out.println(p1);
        System.out.println(p2);

    }
}