package fr.epsi.b3c1ThomasBouron;
import PetShop.*;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("petshop");
        EntityManager em = emf.createEntityManager();
        System.out.println("Connected !");

        EntityTransaction et = em.getTransaction();

        // Insertion of a product
        et.begin();

        Product product = new Product();
        product.setName("Product test");
        product.setCode("1111");
        product.setPrice(10.99);
        em.persist(product);

        et.commit();
        System.out.println("Product inserted !");

        // Insertion of a pet store
        et.begin();

        PetStore petStore = new PetStore();
        petStore.setName("pet store test");
        petStore.setManagerName("manager name test");
        em.persist(petStore);

        et.commit();
        System.out.println("Pet store inserted !");

        // Insertion of an address
        et.begin();
        Address address = new Address();
        address.setNumber("1");
        address.setStreet("Charles");
        address.setZipCode("44000");
        address.setCity("Nantes");
        em.persist(address);

        et.commit();
        System.out.println("Address inserted !");
    }
}