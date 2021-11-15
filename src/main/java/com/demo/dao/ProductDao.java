package com.demo.dao;

import com.demo.entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class ProductDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = emf.createEntityManager();
    public List<Product> getAllProduct(){
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Product> listProduct = em.createQuery("select p from Product p").getResultList();
        em.getTransaction().commit();
        em.close();
        return listProduct;
    }

}
